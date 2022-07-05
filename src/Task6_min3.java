public class Task6_min3 {
    //реализовать функцию нахождения минимума
    //из трех чисел
    public static void main(String[] args) {
        int a = 313; int b = 1213; int c = 1252;
        System.out.println("Меньшее число из трёх: " + min3(a, b, c));
    }

    public static int min3(int a, int b, int c) {
        if(a < b && a < c) {
            return a;
        }
        else if (b < a && b < c) {
            return b;
        }
        else return c;

    }
}
