public class Task1 {
    // Задача про футбольную команду
    // v. 2.0 - закодил ситуацию по дефолту, предположим что когда не выпадает 0, 1 или 3, матч не играли
    public static void main(String[] args) {

        //сгенерим число от 1 до 3, типа количество очков, набранных командой за игру
        int score = (int)(Math.random() * 4);

        switch (score) {
            case (0):
                System.out.println("Команда А набрала за игру " + score + " очков. Это ПОРАЖЕНИЕ.");
                break;
            case (1):
                System.out.println("Команда А набрала за игру " + score + " очков. Это ничья.");
                break;
            case (3):
                System.out.println("Команда А набрала за игру " + score + " очков. Это ПО-БЕ-ДА!!!");
                break;
            default:
                System.out.println("Матч не проводился.");
                break;

        }

    }
}
