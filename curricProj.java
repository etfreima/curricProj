
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
        classCategories.bla();
                println("1. Create Schedule\n2. View required classes");
                int uI2 = userInput.nextByte();

                if(uI2 == 1){
                    currentProgress.view();
        }
        }
        else{
        System.exit(0);
        }
        
        
    }
    
    
    public static void println(String args) {
        System.out.println(args);
}
    
    public static void print(String args) {
        System.out.print(args);
}
}
