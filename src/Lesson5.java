import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        multTable(7);
        System.out.println();
        System.out.printf("Cумма всех чисел от 100 до 500 = %d\n", from_100_to_150sum());
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число a --> ");
        int a = sc.nextInt();
        System.out.println("Введите число b --> ");
        int b = sc.nextInt();
        ask_for_sum(a, b);
        System.out.println();
        System.out.println("Введите n - количество чисел которые будете вводить -> ");
        int n = sc.nextInt();
        double_avg(n);
        sc.close();

    }

    //Напечатать ряд чисел 20 в виде:
    //20 20 20 20 20 20 20 20 20 20.
    public static void tenTwelve() {
        for(int i = 0; i < 10; i++){
            System.out.print(20);
            if(i != 9) {
                System.out.print(" "); //пока не достигнут последний элемент, выводим пробел вслед за числом
            }
        }
    }

    //Напечатать числа следующим образом:
    //10 10.4
    //11 11.4
    //...
    //25 25.4
    public static void printWDouble(int start, int end) {
        for(int i = start; i<=end; i++) {
            System.out.println(i + " " + i+".4");
        }

    }

    //    Напечатать таблицу умножения на 7:
    //            1 х 7 = 7
    //            2 х 7 = 14
    //            ...
    //            9 х 7 = 63
    public static void multTable(int n) {
        for(int i = 1; i <= 9; i++) {
            System.out.printf("%d x %d = %d\n", i, n, i * n);
        }
    }

    //    Найти:
    //    1. сумму всех целых чисел от 100 до 500;

    public static int from_100_to_150sum() {
        int sum=0;
        for(int i = 100; i <= 500; i++) {
            sum+=i;
        }
        return sum;
    }

    //    2. сумму всех целых чисел от a до b (значения a и b вводятся с клавиатуры; b>=a).
    public static void ask_for_sum(int a, int b) {
        if(b >= a) {
            int sum = 0;
            for(int i = a; i <= b; i++) {
                sum+=i;
            }

           System.out.printf("Сумма чисел в диапазоне от %d до %d равна = %d\n", a, b, sum);
        }
        else {
            System.out.println("Число b должно быть больше или равно числу a!");
        }

    }

    //  Даны натуральное число n и вещественные числа a1, a2, ..., an.
    //  Определить среднее арифметическое вещественных чисел
    public static void double_avg(int n) {
        double number;
        double sum = 0.0;
        Scanner double_sc = new Scanner(System.in);

        for(int i = 0; i < n; i++) {
            number = double_sc.nextDouble();
            sum+=number;
        }
        System.out.printf("Среднее арифметическое введённой последовательности вещественных чисел = %.1f\n", sum / n);
    }


}
