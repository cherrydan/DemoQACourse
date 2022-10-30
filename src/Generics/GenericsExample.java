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
        String s = "ABC";
        show(s, c);
        //Обьявляем класс с дженериком
        Person<Integer> person =  new Person<>();
        person.show(1, 2);

        Person<Double> person2 = new Person<>(2.94, 5.44);
        System.out.println(person2.getA() + " " + person2.getB());

    }
    //синтаксис применения дженерикового типа в фн-ции
    // public static <Т> возвр значение имя фн-ции(Т парам, ...)
    //Т и U позволяют нам использовать разные любые типы
    public static <T, U>  void show(T a, U b) {
        System.out.println(a + " " + b);
    }

}
