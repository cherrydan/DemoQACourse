import java.util.*;

public class WeightClassified {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Введите вес спортсмена --> ");
        int weight = in.nextInt();

        if (weight > 91) {
            System.out.println("Супертяжелый вес");
        }
        else if(weight > 48 && weight <= 60) {
            System.out.println("Лёгкий вес");
        }
        else if(weight > 60 && weight <=75) {
            System.out.println("Средний вес");
        }
        else if (weight > 75 && weight <= 91) {
            System.out.println("Тяжелый вес");
        }
       else if (weight < 48) {
           System.out.println("Недопустимо маленький вес! Подкрепитесь!");
        }


        in.close();
    }

}
