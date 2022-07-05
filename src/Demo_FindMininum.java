import java.util.Scanner;

public class Demo_FindMininum {
    //Функция findMinumum  покажет нам минимум из любой последовательности чисел
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел в последовательности --> ");
        int n = sc.nextInt();
        System.out.println("Минимальное число в последовательности = " + findMinimum(n));
        sc.close();
    }

    public static int findMinimum(int n) {
        int min = Integer.MAX_VALUE; //Максимальное число от которого будем искать (при варианте поиска МАКСИМУМА = 0
        Scanner next_scanner = new Scanner(System.in);
        //тема циклы: заводим цикл for
        for(int i = 0; i < n; i++) {
            int number = next_scanner.nextInt();
            if(number < min) {
                min = number;
            }
        }
        return min;
    }
}
