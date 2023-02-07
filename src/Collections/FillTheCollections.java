package Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class FillTheCollections {

    public static ArrayList<Integer> FillArrayList(long capacity) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < capacity; i++) {
            arrayList.add(i);
        }
        return arrayList;
    }


    public static LinkedList<Integer> FillLinkedList(long capacity) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i = 0; i < capacity; i++) {
            linkedList.add(i);
        }
        return linkedList;
    }
}
