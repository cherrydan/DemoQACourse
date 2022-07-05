package Arrays;

import java.util.Random;
//import java.util.Scanner;
//Доделать, разобраться
public class Demo4 {

    public static void main(String[] args) {
        double[] numbers = new double[5];
        double firstElement = 0;

        Random r = new Random();
        /*
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        */

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(10);
            if(i == 0) {
               firstElement = numbers[i];
            }
            System.out.print(numbers[i] + " ");

        }
        System.out.println();

        for(int i = 0; i < numbers.length; i++) {
            /*
            numbers[i]*=2;
            numbers[i]-=a;
            */
            numbers[i] /= firstElement;
            System.out.print(numbers[i] + " ");
        }
        //sc.close();
        System.out.println();
    }
}
