package Generics;
//Начинаю постигать дженерики
public class GenericsExample {

    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        Double c = 2.32;
        Double d = 5.05;
        show(a, b);
        show(c, d);

    }

    public static <T>  void show(T a, T b) {
        System.out.println(a + " " + b);
    }
}
