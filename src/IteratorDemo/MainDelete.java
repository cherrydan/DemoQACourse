package IteratorDemo;

import java.util.LinkedList;

public class MainDelete {

    public static void main(String[] args) {
        LinkedList<Integer> list = getRandomList();
        // самый быстро работающий способ удалить из списка что-то по итератору
        list.removeIf(item -> item >= 128);
    }

    public static LinkedList<Integer> getRandomList() {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0; i < 100000; i++) {
            list.add((int)Math.round(Math.random() * 256));
        }
        return list;
    }
}
