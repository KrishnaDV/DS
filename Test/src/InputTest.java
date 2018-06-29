import java.util.Scanner;


public class InputTest {

	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        s.nextLine();
        
        String inp = null;
        
        for(int i=0;i<n;i++){
            
            inp = s.nextLine();
            
        }
        
        for(int i=0;i<inp.length();i++){
            
            if(i%2 == 0){
                
                System.out.print(inp.charAt(i));
                
            }   
            
        }
        
	}
	
}
