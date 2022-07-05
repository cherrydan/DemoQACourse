import java.util.Scanner;
//выводим ёлочку в заданном количестве рядов из заданного символа
// v. 2.0 - забыл закрыть сканеры, сделал приглашения к вводу
public class NumberToPyramid {
    public static void main(String[] args) {

        Scanner main_sc = new Scanner(System.in);
        System.out.println("Введите количество рядов --> ");
        int n = main_sc.nextInt();

        print5Again(n);
        main_sc.close();

    }


    public static void print5Again(int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите символ, которым будет отображаться пирамида --> ");
        String ch = sc.nextLine();
        String row = "";
        for(int i = 0; i < n; i++) {
            row+=ch;
            System.out.println(row);
        }
        sc.close();
    }
}
