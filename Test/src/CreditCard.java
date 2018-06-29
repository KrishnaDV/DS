import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreditCard {

	public static void main(String[] args) {

		String banned[] = { "11", "3434", "67234", "9" };

		String Cards[] = { "6724843711060148" };

		System.out.println(validateCards(banned, Cards));

	}

	static List<Map<String, Object>> validateCards(String[] banned,
			String[] cardsToValidate) {

		List<Map<String, Object>> resList = new ArrayList<Map<String, Object>>();



		for (String Card : cardsToValidate) {

			Map<String, Object> res = new HashMap<String, Object>();
			
			res.put("card", Card);

			res.put("isValid", valid(Card));

			res.put("isAllowed", allowed(Card, banned));

			resList.add(res);
		}

		return resList;

	}

	private static boolean allowed(String card, String[] banned) {

		for (String check : banned) {

			if (card.startsWith(check)) {
				return false;
			}

		}
		return true;
	}

	private static boolean valid(String card) {

		long lastDigit = (Long.parseLong(card)) % 10;

		int sum = 0;

		for (int i = 0; i < card.length() - 1; i++) {

			char c = card.charAt(i);

			int dble = Character.getNumericValue(c) * 2;

			sum += dble;
		}

		if ((sum % 10) == lastDigit) {
			return true;

		}
		return false;
	}

}
