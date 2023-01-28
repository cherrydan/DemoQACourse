package Arrays;
//Двумерные массивы - ragged array
public class Array_2_demension {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 4, 5, 6},
                {6, 7, 8, 9, 10},
                {11, 12, 13},
                {14, 15},
                {16}
        };

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

    }
}
