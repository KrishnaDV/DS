import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class PricingEngine {

	public List<Double> getCalculatedPrices(Map<String, String> productMap, Map<String, SurveyPrice> surveyMap) {

		Set<String> keys = productMap.keySet();

		Set<Double> filter = new TreeSet<Double>();

		// Consolidated map contains prices per category
		Map<String, List<Double>> priceMap = new HashMap<>();

		for (String product : keys) {

			List<Double> prices = new ArrayList<Double>();

			for (String surveyProduct : surveyMap.keySet()) {

				if (surveyProduct.contains(product)) {

					SurveyPrice sp = surveyMap.get(surveyProduct);

					prices.add(sp.getPrice());

				}

				Collections.sort(prices);

				priceMap.put(product, prices);

			}

		}

		// Filter out promotional and Data Errors

		for (String key : priceMap.keySet()) {

			Double total = 0.0;

			List<Double> priceList = priceMap.get(key);

			for (int i = 0; i < priceList.size(); i++) {
				total += priceList.get(i);
			}

			Double average = (total / (priceList.size()));

			// Remove values that are lesser and greater

			Iterator<Double> itr = priceList.iterator();

			while (itr.hasNext()) {

				Double price = itr.next();
				if (price < (0.5 * average) || price > (1.5 * average)) {
					itr.remove();
				}
			}
		}

		// Get the Multiplication Factors for each Product based on Supply and Demand
		Map<String, Double> multiplactionFactorMap = getMultiplicationFactor(productMap);
		// Get the final result
		List<Double> result = getFilteredPrices(priceMap, multiplactionFactorMap);
		return result;
	}

	private static Map<String, Double> getMultiplicationFactor(Map<String, String> productMap) {

		Map<String, Double> multiplicationMap = new HashMap<>();

		for (String product : productMap.keySet()) {

			String code = productMap.get(product);

			if (code.charAt(0) == 'H' && code.charAt(1) == 'H') {
				multiplicationMap.put(product, 1.0);
			} else if (code.charAt(0) == 'L' && code.charAt(1) == 'L') {
				multiplicationMap.put(product, 1.1);
			} else if (code.charAt(0) == 'L' && code.charAt(1) == 'H') {
				multiplicationMap.put(product, 1.05);
			} else if (code.charAt(0) == 'H' && code.charAt(1) == 'L') {
				multiplicationMap.put(product, 0.95);
			}

		}

		return multiplicationMap;
	}

	private static List<Double> getFilteredPrices(Map<String, List<Double>> priceMap,
			Map<String, Double> multiplactionFactorMap) {

		List<Double> result = new LinkedList<>();

		for (String product : priceMap.keySet()) {

			Double res;

			List<Double> filter = new LinkedList<>();

			List<Double> prices = priceMap.get(product);

			for (int i = 0; i < (prices.size() - 1); i++) {

				if (prices.get(i).equals(prices.get(i + 1))) {
					if (!filter.contains(prices.get(i))) {
						filter.add(prices.get(i));
					}
				}
			}

			if (filter.size() > 0) {
				res = filter.get(0);
			} else {
				res = prices.get(0);
			}

			Double mulValue = multiplactionFactorMap.get(product);

			result.add(res * mulValue);
		}

		return result;
	}

}
