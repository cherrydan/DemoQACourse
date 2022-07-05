import java.util.Scanner;
//считываем разные типы данных через класс Scanner
public class Demo3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Integer num = in.nextInt();
        System.out.println(num);

        Double d_number = in.nextDouble();
        System.out.println(d_number);

        String word = in.next();
        System.out.println(word);
        in.close();


    }
}
