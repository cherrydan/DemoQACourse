package DynamicData;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>();
        myHashSet.add(100);
        myHashSet.add(-3);
        myHashSet.add(2);

        for(int i: myHashSet) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
}
