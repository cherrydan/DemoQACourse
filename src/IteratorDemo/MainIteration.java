package IteratorDemo;

import java.util.Collections;
import java.util.LinkedList;

public class MainIteration {

    public static void main(String[] args) {
        Integer[] array = { 64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};

        LinkedList<Integer> list = new LinkedList<>();

        Collections.addAll(list, array);

        // создаём пока некастомный итератор

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }

        System.out.println();

        //for each = сокращенная запись с итератором
    }
}
