import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogValidation {

	public static void main(String[] args) {

		List<Log> lgs = new ArrayList<Log>();
		
		Log lg1 = new Log("PERFORMANCE","12345678906","1",200);
		
		Log lg2 = new Log("PERFORMANCE","12345678906","2",400);

		Log lg3 = new Log("ERROR","12345678906","3",200);
		
		Log lg4 = new Log("INFO","12345678906","4",200);
		
		Log lg5 = new Log("INFO","45345678900","5",200);

		lgs.add(lg1);
		lgs.add(lg2);
		lgs.add(lg3);
		lgs.add(lg4);
		lgs.add(lg5);
		
		System.out.println(validateLogs(lgs));

	}

	private static Map<String, List<String>> validateLogs(List<Log> logs) {

		Map<String, List<String>> result = new HashMap<String, List<String>>();

		List<String> performance = new ArrayList<String>();

		List<String> info = new ArrayList<String>();

		List<String> error = new ArrayList<String>();

		for (Log lg : logs) {

			if (!lg.type.equals(null)) {

				if (lg.type.equals("ERROR") || !isValidUser(lg.userId)
						|| lg.statusCode >= 400) {
					error.add(lg.messageId);
				} else if (lg.type.equals("INFO")) {
					info.add(lg.messageId);
				} else {
					performance.add(lg.messageId);
				}

			}
		}
		result.put("INFO", info);
		result.put("PERFORMANCE", performance);
		result.put("ERROR", error);
		return result;
	}

	private static boolean isValidUser(String userId) {

		long lastDigit = (Long.parseLong(userId)) % 10;

		int firstTwo = Integer.parseInt(userId.substring(0, 2));

		if (lastDigit!=0 || (firstTwo % lastDigit) == 0) {

			return true;
		}

		return false;
	}

	private static class Log {
		public Log(String type, String userId, String messageId, int statusCode) {
			this.type = type;
			this.userId = userId;
			this.messageId = messageId;
			this.statusCode = statusCode;
		}
		String type;
		String userId;
		String messageId;
		int statusCode;
	}
}
