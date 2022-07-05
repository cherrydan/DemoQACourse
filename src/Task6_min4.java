public class Task6_min4 {
    //реализовать функцию нахождения минимума
    //из 4х чисел

    public static void main(String[] args) {
        int a = 1200; int b = 3989; int c = 2393; int d = 445;
        System.out.println("Меньшее число из четырёх: " + min4(a, b, c, d));
    }

    public static int min4(int a, int b, int c, int d) {
        if(a < b && a < c && a < d) {
            return a;
        }
        else if (b < a && b < c && b < d) {
            return b;
        }
        else if (c < a && c < b && c < d) {
            return c;
        }
        else return d;
    }
}
