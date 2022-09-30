//задача с курса по Java на Степик, считает количество введённых слов изпользуя метод сканера hasNext
import java.util.Scanner;
class TaskCycles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        System.out.println("Начните вводить слова каждое с новой строки (сигнал конца ввода в IDE - Ctrl+D --> ");
        while(sc.hasNextLine()) { //пока есть следующий ввод - вводим слово и считаем
            String word = sc.nextLine();
            counter++;
        }
        System.out.println("Слов введено = " + counter);

    }
}
