package Collections;
//сравнение быстродействия arraylist и linkedlist
//arraylist быстрее вытаскивает элементы чем linkedlist (примерно в 54 раза на моём компе)
//но, при использовании Iterator или встроенного в foreach итератора, это происходит так же быстро как и с ArrayList

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class CompareArrayAndLinkedLists {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

//        for(int i = 0; i < 10000; i++) {
//            arrayList.add(i);
//            linkedList.add(i);
//        }

        arrayList = FillTheCollections.FillArrayList(10000);
        linkedList = FillTheCollections.FillLinkedList(10000);

        long start = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++)
            arrayList.get(i);
        long end = System.currentTimeMillis();

        System.out.printf("Time taken for arraylist = %d milliseconds\n", (end-start));

        start = System.currentTimeMillis();
        for (int i = 0; i < linkedList.size(); i++)
            linkedList.get(i);
        end = System.currentTimeMillis();

        System.out.printf("Time taken for linkedlist = %d milliseconds\n", (end-start));

        //но... если провернуть на linkedlistе итератор, то...
        start = System.currentTimeMillis();
        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        end = System.currentTimeMillis();

        System.out.printf("Time taken for linkedlist with iterator = %d milliseconds\n", (end-start));


        start = System.currentTimeMillis();
        for (Integer integer : linkedList)
            end = System.currentTimeMillis();

        System.out.printf("Time taken for linkedlist with foreach built-it iterator = %d milliseconds\n", (end-start));
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        LinkedList<Integer> linkedList2 = new LinkedList<>();

        // теперь посмотрим на удаление первого элемента в большом массиве на 10e7
        arrayList2 = FillTheCollections.FillArrayList(10000000);
        linkedList2 = FillTheCollections.FillLinkedList(10000000);
        start = System.currentTimeMillis();
        arrayList2.remove(0);
        end = System.currentTimeMillis();

        System.out.printf("Time taken for arraylist removing one elem %d millis\n", (end - start));

        start = System.currentTimeMillis();
        linkedList2.remove(0);
        end = System.currentTimeMillis();

        System.out.printf("Time taken for linkedlist removing one elem %d millis\n", (end - start));




    }
}
