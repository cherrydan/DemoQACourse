package DynamicData;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Харьков");
        queue.offer("Киев");
        queue.offer("Кременчуг");
        queue.offer("Львов");

        System.out.println(queue.peek());
        System.out.println();
        String town;

        while ((town = queue.poll()) != null) {
            System.out.println(town);
        }
    }
}

