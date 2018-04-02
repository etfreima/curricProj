
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
        println("Curriculum Viewer v0.1\n1. Create current progress\n2.Exit");
        String uI = userInput.next();
        println("Curriculum Viewer v0.1\n1. Create Schedule\n2. Create current progress\n3. View required classes");
        String uI2 = userInput.next();
    }
    
    
    public static void println(String args) {
        System.out.println(args);
}
}

