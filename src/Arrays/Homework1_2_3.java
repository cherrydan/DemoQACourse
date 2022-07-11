package Arrays;

import java.util.Random;

/*
1. Заполнить массив из двенадцати элементов 1, 2, ... 12.
2. Вывести элементы массива на экран в обратном порядке.
3. Определить:
a. сумму всех элементов массива;
b. произведение всех элементов массива; Сделаем проверку и не будем умножать на 0
c. сумму квадратов всех элементов массива;
d. сумму шести первых элементов массива
 */
public class Homework1_2_3 {
    public static void main(String[] args) {
        //1.
        int[] numbers = new int[12];
        Random r = new Random();
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(5);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        //2.
        for(int i = numbers.length-1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println('\n');

        int sum = 0;
        int product = 1;
        int squares = 0;
        int six_elem = 0;

        //3a
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Сумма элементов: " + sum);

        //3b
        for (int number : numbers) {
            if(number == 0) {
            }
            else {
                product *= number;
            }
        }
        System.out.println("Произведение элементов: " + product);

        //3c.
        for(int i = 0; i < numbers.length; i++) {
            squares+=numbers[i]*numbers[i];
        }
        System.out.println("Сумма квадратов элементов: " + squares);

        for(int i = 0; i < numbers.length; i++) {
            if(i < 6) {
                six_elem+=numbers[i];
            }
        }
        System.out.println("Сумма шести первых элементов: " + six_elem);
    }

}
