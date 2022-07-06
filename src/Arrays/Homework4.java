package Arrays;
/*
Дан массив. Вывести на экран сначала его неотрицательные элементы, затем
отрицательные.
 */
public class Homework4 {
    public static void main(String[] args) {

        printValues(1);
        System.out.println();
        printValues(-1);

    }

    public static void printValues(int direction) {
        int[] numbers = new int[]{
                4, 6, -5, -657, 2399,
                364374, 575, 9, -12,
                -7, 0
        };
        if (direction == 1) {
            System.out.print("Неотрицательные элементы массива: ");
            for (int number : numbers) {
                if (number >= 0) {
                    System.out.printf("%d | ", number);
                }
            }
        }
        else if(direction == -1) {
            System.out.print("Отрицательные элементы массива: ");
            for (int number : numbers) {
                if (number < 0) {
                    System.out.printf("%d | ", number);
                }
            }
        }
    }

}

