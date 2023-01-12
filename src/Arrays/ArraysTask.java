package Arrays;
//Вывести двумерный массив 5*5 таким образом, чтобы по его главной диагонали были 1 в остальных случаях 0
public class ArraysTask {

    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }

        for (int[] rows : arr) {
            for (int cols : rows) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }
}
