package Generics;


class A{
    public static <T> T  getFirstValue(T[] array){return array[0];}
}


public class MyClass {
    public static void main(String[] args) {

        Long[] a = {1L, 2L};

        //List< Integer> a = new ArrayList<>(); Integer b = A. getFirstValue(a);
    }
}
