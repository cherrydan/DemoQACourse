import java.util.Scanner;
//Исправить формулы по трём сторонам
public class Task7_triangle {

    //Даны две стороны двух треугольника
    //Найти сумму их периметров и сумму их площадей
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сторону a треугольника 1  --> ");
        double a1 = sc.nextDouble();
        System.out.println("Введите сторону b треугольника 1  --> ");
        double b1 = sc.nextDouble();
        System.out.println("Введите сторону c треугольника 1  --> ");
        double c1 = sc.nextDouble();
        System.out.println("Введите сторону a треугольника 2  --> ");
        double a2 = sc.nextDouble();
        System.out.println("Введите сторону b треугольника 2  --> ");
        double b2 = sc.nextDouble();
        System.out.println("Введите сторону c треугольника 2  --> ");
        double c2 = sc.nextDouble();

        System.out.println("Сумма периметров двух треугольников: " + (triangle_per(a1, b1, c1)
                + triangle_per(a2, b2, c2)));
        System.out.println("Сумма площадей двух треугольников по формуле Герона = " +
                (triangle_square(a1, b1, c1) + triangle_square(a2, b2, c2)));

        sc.close();

    }

    // Периметр треугольника по трём сторонам
    public static double triangle_per(double a, double b, double c) {
        if (b >= (a + c)) {
            System.out.println("Сторона b не может быть больше или равна сумме сторон a и c");
            return -1;
        }
        else if (c >= (a + b)) {
            System.out.println("Сторона c не может быть больше или равна сумме сторон a и b");
            return -1;
        }
        else if (a >= (b+c)) {
            System.out.println("Сторона a не может быть больше или равна сумме сторон b и c");
            return -1;
        }
        else {
            return a + b + c;
        }
    }

    //Площадь треугольника по формуле Герона
    public static double triangle_square(double a, double b, double c) {
        //берём полупериметр, воспользуемся функцией, которую мы написали выше
        double p = triangle_per(a, b, c) / 2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }


}
