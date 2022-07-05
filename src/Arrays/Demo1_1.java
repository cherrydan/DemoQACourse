package Arrays;

import java.util.Scanner;

public class Demo1_1 {
    public static void main(String[] args) {
        String[] strings = new String[3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < strings.length; i++) {

            strings[i] = sc.next();

        }

        for (int i = 0; i < strings.length; i++) {
            System.out.printf("strings[%d] = %s\n", i, strings[i]);
        }
        sc.close();

    }
}
