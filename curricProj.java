
package curricproj;
import java.util.Scanner;
/**
 *
 * @author efreima
 */
public class CurricProj {

    
    public static void main(String[] args) {
        //Declare variables
        Scanner userInput = new Scanner(System.in);
        
        println("Curriculum Viewer v0.1\n1. Create current progress\n2. Exit");
        int uI = userInput.nextByte();
        
        if(uI <= 0 || uI > 2){
        println("Invalid input, resetting.");
        main(new String[0]);
        }
        else if(uI == 1){
        //invoke class.method
        }
        else{
        System.exit(0);
        }
        
        println("Curriculum Viewer v0.1\n1. Create Schedule\n2. Create current progress\n3. View required classes");
        int uI2 = userInput.nextByte();
    }
    
    
    public static void println(String args) {
        System.out.println(args);
}
    
    public static void print(String args) {
        System.out.print(args);
}
}
