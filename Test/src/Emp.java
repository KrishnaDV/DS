import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Emp {

	public static void main(String[] args) throws IOException {

		String input = "A:\\input.txt";
		
		String line = null;

		FileReader fr = new FileReader(input);

		BufferedReader br = new BufferedReader(fr);
		
		ArrayList<String> ql = new ArrayList<String>();
		
		List<Address> ad = new ArrayList<Address>();

		while ((line = br.readLine()) != null) {
			
			//System.out.println(line);

			String[] det = line.split(" ");
			
			String id = det[0];
			
			String name = det[1];
			
			String desgn = det[2];
			
			String add [] = det[3].split("/");
			
			String street = add[0];
			
			String city = add[1];
			
			int zip = Integer.parseInt(add[2]);
			
			Address ad1 = new Address(street,city,zip);
			
			String qual [] = det[4].split("/");
			
			System.out.println(id+" "+name+" "+desgn+" "+ad1);
			
			for(int i=0;i<qual.length;i++){
				
				System.out.println(qual[i]);
				
				ql.add(qual[i]);
				
			}
			
			
			
		}

	}

}
