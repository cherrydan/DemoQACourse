import java.util.Scanner;

public class Task5 {

//Даны два числа. Если квадратный корень из второго числа меньше первого числа,
// то увеличить второе число в пять раз
    public static void main(String[] args) {
        double a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число --> ");
        a = sc.nextDouble();
        System.out.println("Введите второе число --> ");
        b = sc.nextDouble();
        double sqr_b = Math.sqrt(b);

        if(sqr_b < a) {
            b*=5;
            System.out.println("b*=5 = " + b);
        }


        sc.close();
    }
}
