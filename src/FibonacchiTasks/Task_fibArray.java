package FibonacchiTasks;

import java.util.Scanner;

public class Task_fibArray {

    /*
    Вывод чисел Фибоначчи на статическом массиве
     */
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
            System.out.printf("\nСумма %d членов послед. Фибоначчи = %d есть чётное число\n", n, sum);
        }
        else {
            System.out.printf("\nСумма %d членов послед. Фибоначчи = %d есть нечётное число\n", n, sum);
        }

        sc.close();


    }

    public static boolean checkIsEven(long sum) {
        //если наше число делится без остатка на 2 оно чётное
        return sum % 2 == 0;
    }

    public static long fib(int n) {
        long[] arr = new long[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }
}

