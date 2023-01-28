package Arrays;

public class for_each {

    public static void main(String[] args) {
        int[] arr = new int[30];


        for (int x = 0; x < arr.length; x++) {
            arr[x] = x + 1;
        }

        for(int y: arr) {
            System.out.print(y + " ");
        }

        System.out.println('\n');

        int[][] matrix = {{1, 2, 3},
                           {4, 5, 6}
        };
        for(int[] a : matrix) {
            for(int x: a) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
