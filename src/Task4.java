import java.util.Scanner;
//даны три вещественных числа
//проверить выполняется ли неравенство a < b < c
//и неравенство a > b > c
public class Task4 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите вещественное число1 --> ");
        a = sc.nextDouble();
        System.out.println("Введите вещественное число2 --> ");
        b = sc.nextDouble();
        System.out.println("Введите вещественное число3 --> ");
        c = sc.nextDouble();

        if(a < b && b < c) {
           System.out.println("Неравенство выполняется");
        }
        else {
            System.out.println("Неравенство не выполняется");
        }

        if(a > b && b > c) {
            System.out.println("Неравенство выполняется");
        }
        else {
            System.out.println("Неравенство не выполняется");
        }

        sc.close();
    }
}
