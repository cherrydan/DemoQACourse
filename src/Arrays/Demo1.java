package Arrays;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10; i++) {

            numbers[i] = sc.nextInt();

        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("numbers[%d] = %d\n", i, numbers[i]);
        }
        sc.close();

    }
}
