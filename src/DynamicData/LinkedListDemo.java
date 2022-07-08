package DynamicData;
/*
Обобщенный класс LinkedList<E> представляет структуру данных в виде связанного списка.
Он наследуется от класса AbstractSequentialList и реализует интерфейсы List, Dequeue и Queue.
То есть он соединяет функциональность работы со списком и фукциональность очереди.
 */
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("F");
        list.add("B");
        list.add("D");
        list.add("E");
        list.add("C");
        list.addLast("Z");
        list.addFirst("A");
        list.add(1, "A2");
        System.out.println("Содержимое исходное: " + list);

        list.remove("F");
        System.out.println("Удаление \"F\"...");
        System.out.println(list);
        System.out.println("Удаление из нового списка индекса 2 (индексы начинаются с 0)...");
        list.remove(2);
        System.out.println("Удалилась \"B\"...");
        System.out.println("Делаем removeFirst и removeLast...");
        list.removeFirst();
        list.removeLast();
        System.out.println("Содержимое после удаления: " + list);

        System.out.println("Берём 2-й элемент в последнем варианте списка... Это буковка \"E\"");
        String val = list.get(2);
        System.out.println("Получаем её в строковую переменную методом get... ");
        System.out.println("Видоизменяем её методом set, и кладём во второй индекс....");
        list.set(2, val + "+");
        System.out.println("Содержимое после изменения: " + list);
    }
}