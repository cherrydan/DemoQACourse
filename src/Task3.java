import java.util.Scanner;
//Дано двузначное число. Определить: остаток от деления десятков на единицы, результат деления единиц на десятки
//v 2.0 - добавил отслеживание нашего двузначного числа, чтобы оно не оканчивалось на 0
public class Task3 {

    public static void main(String[] args) {
        System.out.println("Введите двузначное число --> ");
        Scanner sc = new Scanner(System.in);
        Integer value = sc.nextInt();

        if (value.toString().length() == 2) {
            if (value % 10 != 0) {
                int dig1 = value / 10;
                int dig2 = value % 10;
                System.out.println("Остаток от деления десятков на единицы = " + dig1 % dig2);
                System.out.println("Результат деления единиц на десятки = " + (double) dig2 / dig1);
            }
            else {
                System.out.println("С числами, оканчивающимися на 0 работать не получится!");
            }

        }
        else {
            System.out.println("Недвузначное число");
        }
        sc.close();
    }
}
