import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

//Problem 5: Pricing Engine
//
//An online retail company conducts market research to competitively price their products.
//Surveyed data contains Product code, Competitor and Price.
// 
//The retail company uses a Pricing engine which recommends most frequently occurring price. If multiple prices occur frequently, the least amongst them is chosen.
// 
//Products are classified based on parameters like Supply, Demand. Possible values are Low (L), High (H)
// 
//If Supply is High and Demand is High, Product is sold at same price as chosen price.
//If Supply is Low and Demand is Low, Product is sold at 10 % more than chosen price.
//If Supply is Low and Demand is High, Product is sold at 5 % more than chosen price.
//If Supply is High and Demand is Low, Product is sold at 5 % less than chosen price.
// 
//Prices less than 50% of average price are treated as promotion and not considered.
//Prices more than 50% of average price are treated as data errors and not considered.
//
//Input consists of number of products, followed by each Product's supply and demand parameters.
//followed by number of surveyed prices, followed by competitor prices.
// 
//Output must be recommended price for each product.	
// 
//Input 1:
//2
//flashdrive H H	
//ssd L H
//5
//flashdrive X 1.0
//ssd X 10.0
//flashdrive Y 0.9
//flashdrive Z 1.1
//ssd Y 12.5
// 
//Output 1:
//A 0.9
//B 10.5
// 
//Input 2:
//2
//mp3player H H
//ssd L L
//8
//ssd W 11.0
//ssd X 12.0
//mp3player X 60.0
//mp3player Y 20.0
//mp3player Z 50.0
//ssd V 10.0
//ssd Y 11.0
//ssd Z 12.0
// 
//Output 2:
//A 50.0
//B 12.1



public class Driver {
	public static void main(String[] args) {

		Map<String, String> productMap = new HashMap<>();

		Map<String, SurveyPrice> surveyMap = new HashMap<>();

		Scanner s = new Scanner(System.in);

		int productCount = s.nextInt();

		s.nextLine();

		int i = 0, j = 0;

		while (i < productCount) {

			String line = s.nextLine();

			String[] items = line.split(" ");

			productMap.put(items[0], items[1] + items[2]);

			i++;
		}

		int surveyCount = s.nextInt();

		s.nextLine();

		while (j < surveyCount) {

			String line = s.nextLine();

			String[] items = line.split(" ");

			surveyMap.put(items[0] + items[1], new SurveyPrice(items[0], items[1], Double.valueOf(items[2])));

			j++;
		}
		
		PricingEngine pe = new PricingEngine();

		List<Double> result = pe.getCalculatedPrices(productMap, surveyMap);

		for (Double finl : result) {
			System.out.println(new DecimalFormat("#0.00").format(finl));
		}
	}
}
