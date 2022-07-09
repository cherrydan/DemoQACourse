package Arrays;
/* Дан двумерный массив
    1) поменять местами первую и третью строку массива
    2) поменять местами второй и последний столбцы
 */

public class Demo11 {

    public static void main(String[] args) {
        String[][] things = new String[][]{
                {"table", "hat", "pancake", "apple"}, //0.0 0.1 0.2 0.3
                {"pear", "pencil", "stick", "pen"},   //1.0 1.1 1.2 1.3
                {"a", "b", "c", "d"}                  //2.0 2.1 2.2 2.3
        };

        int rows = things.length;
        int cols = things[0].length;

        //создаём место для нового массива, такого же размера как и исходный
        String[][] thingsCopy = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0) {
                    thingsCopy[i][j] = things[rows - 1][j];
                } else if (i == (rows - 1)) {
                    thingsCopy[i][j] = things[0][j];
                } else
                    thingsCopy[i][j] = things[i][j];
            }
        }

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(thingsCopy[i][j] + " ");
            }
            System.out.println();
        }

    }
}

