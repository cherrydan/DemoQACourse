package Arrays;

public class Task8 {
    /* Дан двумерный массив.
    Вывести на экран элемент, расположенный в правом верхнем углу массива
    ----------- " ------------------------- в левом нижнем углу массива
     */

    public static void main(String[] args) {
        String[][] things = new String[][]{
            {"table", "hat", "pancake", "apple"},
            {"pen", "pencil", "stick", "pear"},
        };
        //крайне правый индекс двумерного массива
        int indexRight = things[0].length - 1;
        //и крайне левого индекса
        int indexLeft = things.length - 1;
        System.out.println(things[0][indexRight]);
        System.out.println(things[indexLeft][0]);


    }

}
