package FibonacchiTasks;

import java.util.Scanner;
import java.util.stream.Stream;

public class Task_fibStream {

    /*
    Сделаем выведение чисел фибоначчи через iterator класса Stream
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сколько чисел фибоначчи хотите вывести --> ");
        int n = sc.nextInt();

        Stream.iterate(new long[]{0, 1}, arr -> new long[]{arr[1], arr[0]+ arr[1]})
                .limit(n+1) //иначе выводится на одно число меньше
                .map(y -> y[0])
                .forEach(x -> System.out.println("Fib(lim. "+ n + ") = " + x));

        sc.close();

    }

}
