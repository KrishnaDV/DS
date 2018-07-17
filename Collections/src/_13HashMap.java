import java.util.*;
import java.util.Map.Entry;


public class _13HashMap {
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();//<> from jdk 1.7
		

		
		map.put(106, "Ramesh");
		map.put(101,"Suraj");
		map.put(102, "Kiran");
		map.put(102, "a aa");
		
		System.out.println(map);
		//Getting access to particular element
		System.out.println(map.get(101));
		System.out.println(map.get(110));
		
		
		
		Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator();
		
		while(iterator.hasNext()){
			Entry<Integer, String> nextValue = iterator.next();
			System.out.println(nextValue.getKey()+ "==>"+nextValue.getValue());
		}
		
		Set<Integer> keySet=map.keySet();
		//System.out.println(keySet);
		
//		for(int key:keySet){
//			System.out.println(key+" ==>"+map.get(key));
//		}
		
		
		
		Set<String>  values=new HashSet<String>(map.values());
		
		System.out.println(values);
		
		map.putIfAbsent(104, "Satish");
		
		
		System.out.println(map);
		
		for(String value:values){
		//	System.out.println(value);
		}
	}
}
