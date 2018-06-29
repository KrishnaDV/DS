
public class FileTest {

	
	public static void main(String[] args) {
		
		String input = "This is legend string\n"+
		"let me tell you why this is important let.\n"+
		"Let adnfgkalf akgnkg;n adgaff";
		
		System.out.println(input);
		
		
		int count = 0;
		
		
		String [] lines = input.split("\n");
		
		for(String line : lines){
			String [] words = line.split(" ");
			for(String word : words){
				if(word.contains("le")){
					count++;
					break;
				}
			}
		}
		
		System.out.println(count);
	}
}
