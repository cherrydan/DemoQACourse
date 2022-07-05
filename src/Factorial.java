import java.util.Scanner;

public class Factorial {

    // написать функцию, возвращающую факториал числа n
    public static void main(String[] args) {

        // Проверяем, факториал числа, большего чем 120 нам заполнит всю память)
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число (не более 10) --> ");
        int n = sc.nextInt();
        if (n <= 10) {
            System.out.println("Факториал числа " + n + " равен " + factorial(n));
        }
        else {
            System.out.println("Слишком большое число!");
        }
        sc.close();
    }

    public static int factorial(int n) {
        //Базовый случай
        if(n == 0) {
            return 1;
        }
        return factorial(n - 1) * n; //рекурсивный случай (n - 1) будет уменьшать наш счётчик, пока не дойдёт до 0
    }
}
