package Arrays;
import java.util.Random;
import java.util.Scanner;
public class TaskFromInterview {
    public static void main(String[] args) {
        final int N;
        Scanner sc = new Scanner(System.in);
        System.out.println("N (>=3) --> ");

        N = sc.nextInt();
        int min = 9;
        System.out.println();
        if(N >= 3 && N % 2 != 0) {
            int[][] numbers = new int[N][N];
            Random r = new Random();
            for(int i = 0; i < numbers.length; i++) {
                for(int j = 0; j < numbers[0].length; j++) {
                    numbers[i][j] = r.nextInt(10);
                    System.out.printf("%d ", numbers[i][j]);
                }
                System.out.println();
            }
            for(int i = 0; i < N; i++) {
                if(numbers[i][N-1-i] < min) {
                    min = numbers[i][N-1-i];
                if(i == N/2) continue;
                }
            }

            System.out.printf("\nМинимальный элемент побочной диагонали = %d\n", min);
        }
        else {
            System.out.println("Число должно быть больше или равно 3 и быть нечётным");
        }
    }
}
