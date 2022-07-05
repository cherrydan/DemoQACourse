import java.util.Scanner;
//Введение в функции. Параметры функции
public class Demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum(a, b);
        sc.close();
    }

    public static void sum(int a, int b) {

        System.out.println(a + b);

    }
}
