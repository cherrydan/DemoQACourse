import java.util.Scanner;

public class Lesson5_2 {
    //Циклы do while... while
    public static void main(String[] args) {
        doWhileDemo();

    }
    // Дана непустая последовательность целых чисел, оканчивающаяся нулем. Найти:
    //1. сумму всех чисел последовательности;
    //2. количество всех чисел последовательности

    public static void doWhileDemo() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int number;
        do {
            System.out.println("Введите число (для окончания 0) --> ");
            number = sc.nextInt();
            sum += number;
            count++;
        }
        while (number != 0);
        sc.close();
        System.out.printf("\nСумма чисел последовательности %d\n", sum);
        System.out.printf("Количество чисел в последовательности %d\n", count - 1);

    }

}
