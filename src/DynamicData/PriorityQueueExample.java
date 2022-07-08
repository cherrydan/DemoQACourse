package DynamicData;
/*
Класc PriorityQueue
PriorityQueue – это класс очереди с приоритетами. По умолчанию очередь с приоритетами размещает элементы согласно
естественному порядку сортировки используя Comparable.
Элементу с наименьшим значением присваивается наибольший приоритет.
Если несколько элементов имеют одинаковый наивысший элемент – связь определяется произвольно.
Также можно указать специальный порядок размещения, используя Comparator.
*/
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<String> queue1 = new PriorityQueue<>();
        queue1.offer("Киев");
        queue1.offer("Харьков");
        queue1.offer("Львов");
        queue1.offer("Кременчуг");
        queue1.offer("Кременчуг");
        System.out.print("Priority queue с Comparable: "); //выведено будет в алфавитном порядке
        while (queue1.size() > 0) {
            System.out.print(queue1.remove() + " ");
        }
        System.out.println();
        //создаем новую очередь и в конструкторе задаём Comparator
        PriorityQueue<String> queue2
                = new PriorityQueue<>(5, Collections.reverseOrder());
        queue2.offer("Киев");
        queue2.offer("Харьков");
        queue2.offer("Львов");
        queue2.offer("Кременчуг");
        queue2.offer("Кременчуг");
        System.out.print("Priority queue с Comparator: "); //будет выведено в обратном алфавитном порядке
        while (queue2.size() > 0) {
            System.out.print(queue2.remove() + " ");
        }
    }

}