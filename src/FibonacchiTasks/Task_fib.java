package FibonacchiTasks;

import java.util.Scanner;
/* Рекурсивная функция вычисления чисел Фибоначчи, сильно замедляет работу после 42-го числа*/

public class Task_fib {

    //Функция fib будет возвращать n-ное число фибоначчи.
    //Update task:
    //3. Верно ли, что сумма первых n членов последовательности Фибоначчи есть четное число?
    public static void main(String[] args) {
        long sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сколько чисел фибоначчи хотите вывести --> ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            sum += fib(i); // суммируем все члены нашей последовательности фибоначчи
            System.out.printf("Fib(%d) = %d\n", i, fib(i));
        }
        if(checkIsEven(sum)) {
            System.out.printf("Сумма %d членов послед. Фибоначчи = %d есть чётное число\n", n, sum);
        }
        else {
            System.out.printf("Сумма %d членов послед. Фибоначчи = %d есть нечётное число\n", n, sum);
        }

        sc.close();


    }

    public static boolean checkIsEven(long sum) {
        //если наше число делится без остатка на 2 оно чётное
        return sum % 2 == 0;
    }

    public static long fib(int n) {

       if (n <= 1) {
           return n;
       }

       return fib(n-1) + fib(n-2);
    }
}
