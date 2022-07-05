/*
Задача. Двое бросают монету: один бросил ее 10 раз, другой — 11 раз.
Какая вероятность того, что у второго монета выпала орлом большее число раз, чем у первого?
 */
public class RandomCoin {

    private static final int MAX_VALUE = 2;
    public static void main(String[] args) {

        System.out.printf("Вероятность что у второго игрока монета выпала орлом большее число раз %.3f\n",
                game(10000));

    }
    //Функция получает на вход количество попыток, а потом выдаёт вероятность по условию задачи
    public static double game(int attempt) {
        int p = 0;
        for(int i = 1; i <= attempt; i++) {
            int n1 = 0; int n2 = 0;
            //10 попыток игрока1
            for(int j = 1; j <= 10; j++) {
                int b = (int) (Math.random() * MAX_VALUE);
                if(b == 1) n1++;
            }
            //11 попыток игрока2
            for(int k = 1; k <= 11; k++) {
                int b = (int) (Math.random() * MAX_VALUE);
                if(b == 1) n2++;
            }
            if(n2 > n1) p++;
        }
        return p / (double)attempt;

    }
}
