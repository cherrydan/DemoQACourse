package JavaTutor;
//Показываем связку метода Arrays.sort и класса, где обязательно должен быть реализован интерфейс Comparable

import java.util.Arrays;

public class TestComparable
{
    public static void main(String[] args) {
        Men[] man = new Men[3];

        man[0] = new Men(5, "Jack");
        man[1] = new Men(3, "John");
        man[2] = new Men(4, "Paul");

        Arrays.sort(man);

        for (Men men : man) {
            System.out.println(men.getId());
        }
    }
}
