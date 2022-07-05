import java.util.Scanner;

public class Lesson5_3 {
    public static void main(String[] args) {
        whileDemo();
    }

    // Дано натуральное число. Определить:
    //1. количество цифр 3 в нем;
    //2. сколько раз в нем встречается последняя цифра;
    //3. количество четных цифр в нем;
    //4. сумму его цифр, больших пяти;
    //5. произведение его цифр, больших семи;
    //6. сколько раз в нем встречаются цифры 0 и 5 (всего).
    public static void whileDemo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число --> ");
        int number = sc.nextInt();
        int threecount = 0;
        int lastcount = 0;
        int lastDigit = number % 10;
        int evencounter = 0;
        int sum_gr_5 = 0;
        int mul_gr_7 = 1; //!
        int one_five_counter = 0;
        //запускаем цикл дробления числа на разряды пока не достигнем последний разряд (0)
        while (number > 0) {
            int digit = number % 10;

            //1.
            if (digit == 3) {
                threecount++;
            }
            //2.
            if (digit == lastDigit) {
                lastcount++;
            }
            //3.
            if (digit % 2 == 0) {
                evencounter++;
            }
            //4.
            if (digit > 5) {
                sum_gr_5 += digit;
            }
            //5.
            if (digit > 7) {
                mul_gr_7 *= digit;
            }

            //6.
            if (digit == 0 || digit == 5) {
                one_five_counter++;
            }
            number /= 10; //перемещаемся к след разряду и в начало цикла
        }
        //если перемножать на 7 нам было нечего, и у нас там 1, то результат у нас будет 0
        if(mul_gr_7 == 1) {
            mul_gr_7 = 0;
        }

        System.out.printf("количество цифр 3 = %d\n", threecount);
        System.out.printf("сколько раз в нем встречается последняя цифра = %d\n", lastcount);
        System.out.printf("количество четных цифр в нем = %d\n", evencounter);
        System.out.printf("сумма его цифр, больших пяти = %d\n", sum_gr_5);
        System.out.printf("произведение его цифр, больших семи = %d\n", mul_gr_7);
        System.out.printf("цифры 0 и 5 встречаются всего = %d раз(а).\n", one_five_counter);

        sc.close();
    }
}

