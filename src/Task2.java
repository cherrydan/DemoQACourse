import java.util.Scanner;
// Даны радиус круга и сторона квадрата. У какой фигуры площадь больше
// v. 2.0 - закодить ситуацию, когда площади фигур равны
public class Task2 {

    public static void main(String[] args) {
        System.out.println("Введите радиус круга --> ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("Введите сторону квадрата --> ");
        int side = sc.nextInt();

        if ((side * side) > (Math.PI * r * r)) {
            System.out.println("у квадрата площадь больше");
        }
        else if ((side * side) < (Math.PI * r * r)) {
            System.out.println("у круга площадь больше");
        }
        else {
            System.out.println("Площади фигур равны");
        }

        sc.close();
    }
}
