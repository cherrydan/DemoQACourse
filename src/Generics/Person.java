package Generics;

public class Person<T> {
    private T a;
    private T b;

    public Person() {}

    public Person(T a, T b) {
        this.a = a;
        this.b = b;

    }

    public T getA() { return  a; }

    public T getB() {return b; }
    public void show(T a, T b) {
        System.out.println(a + " " + b);
    }
}
