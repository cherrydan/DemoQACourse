import java.util.Scanner;
//задача с курса по Java на Степик, переворачиваем введённое с консоли число математическим способом
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number --> ");
        long l = sc.nextLong();
        System.out.print("Reversed number = ");
        while(l != 0) {
            System.out.print(l % 10);
            l /= 10;
        }
        System.out.println();

    }
}
