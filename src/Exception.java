
import java.util.Scanner;

public class Exception {

    
    
    
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        try {
            String S = in.next();
            
            int s = Integer.parseInt(S);
            System.out.println(s);
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
        
    }
    
}
