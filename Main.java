import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //  Random r = new Random();
        //  int num = r.nextInt();
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        int count = 0;
        for (int i = 0; i < arr1.length; i++)
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    count++;
                }
            }
        if (count == arr1.length) {
            System.out.println(" the arrys r the same");
        } else {
            System.out.println(" the arrys r not the same");
        }

    }
}






