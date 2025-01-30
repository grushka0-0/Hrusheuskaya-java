import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class SecondTask {
    //If the entered name matches “John”, then output “Hello, John”, if not, then output "There is no such name"
    public static void main(String[] args) throws IOException {
        Scanner terminalInput = new Scanner(System.in);
        if(terminalInput.nextLine().equals("John")) {
            System.out.println("Hello John");
        } else{
                System.out.println("There is no such name");
        }
    }
}
