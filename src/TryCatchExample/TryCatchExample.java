package TryCatchExample;

import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        try {
           System.out.println(number / (number - 10));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println(number+1);
        }
    }
}
