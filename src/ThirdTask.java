import java.io.IOException;
import java.util.Scanner;

public class ThirdTask {
    //There is a numeric array at the input, it is necessary to output array elements that are multiples of 3
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        for(int i = 0; i<10; i++){
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i<10; i++){
            if ((array[i] % 3) == 0){
                System.out.print(array[i] + " ");
            }
        }
    }
}
