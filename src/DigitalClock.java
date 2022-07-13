/*
ЗАДАЧА со Степика на которой я поломался.
Реализуйте простые домашние часы.

На вход подаётся число секунд, которое прошло с момента начала суток (00:00:00). Выведите текущее время в формате ЧЧ:ММ:СС.

Примечание 1. Используйте 24-часовой формат.

Примечание 2. Для преобразования типа int в тип String (если это понадобится)
можно использовать встроенный служебный метод String.valueOf(num), который преобразует число num в строку "num".
ЭТО ЛОВУШКА! Не понадобится!
 */
import java.util.Scanner;
class DigitalClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int hours = (time % 86400) / 3600;
        int mins = (time % 3600) / 60;
        int secs  = time % 3600 % 60;
        //!!!
        System.out.println((hours/10 + "" + hours%10)+":"+(mins/10 + "" + mins%10)+":"+(secs/10 + "" + secs%10));
        sc.close();
    }
}