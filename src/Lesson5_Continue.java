import java.util.Scanner;

public class Lesson5_Continue {
    //Дано натуральное число.
    //1. Определить его максимальную цифру
    //2. Определить его минимальную цифру
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int max = 0; //максимальная цифра
        int min = 9; //минимальная цифра
        while (number > 0) { //опять дробим число на разряды
            int digit = number % 10;
            if(digit == 9) {
                max = 9;
                number /= 10;
                continue;
            }
            else if(digit > max) {
                max = digit;
            }
            if(digit == 0) {
                min = 0;
                number /= 10;
                continue;
            }
            else if(digit < min) {
                min = digit;
            }

            number /= 10;
        }
        System.out.printf("min = %d\n", min);
        System.out.printf("max = %d\n", max);
    }
}
