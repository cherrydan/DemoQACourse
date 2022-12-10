package JavaTutor;

import java.util.Arrays;

public class TestMan {

    public static void main(String[] args) {
        Man[] man = new Man[3];
        man[0] = new Man(5, "John");
        man[1] = new Man(3, "Jack");
        man[2] = new Man(4, "Adam");

        Arrays.sort(man); //обязательно реализовать интерфейс Comparable
        for(int i = 0; i < 3; i++)  System.out.println(man[i].id());
}
}
