package Arrays;

import java.util.Random;

/*
Дан двумерный массив
Определить:
1) сумму всех элементов третьей строки массива
2) сумму всех элементов второго СТОЛБЦА массива
 */
public class Task10 {
    public static void main(String[] args) {
        int[][] numbers = new int[3][2];
        Random r = new Random();
        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers[0].length; j++) {
                numbers[i][j] = r.nextInt(5);
               System.out.printf("%d ", numbers[i][j]);
            }
            System.out.println();
        }
        //1)
        for(int i = 0; i < numbers[2].length; i++) {
            sum1 += numbers[2][i];
        }
        System.out.println(sum1);

        //2)
        for (int[] number : numbers) {
            sum2 += number[1];
        }
        System.out.println(sum2);
    }
}
