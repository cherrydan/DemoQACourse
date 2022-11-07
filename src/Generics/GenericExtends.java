package Generics;
//Если нам нужно, чтобы в метод приходил только дженерик наследников определнного класса
public class GenericExtends {

    public static void main(String[] args) {
        Cat cat = new Cat();
        show(cat);
        Dog dog = new Dog();
        System.out.println(dog.getClass().getName());
        Animal animal = new Animal();
        show(animal); //А так пройдёт - потому что Animal сам родитель

    }
    public static <T extends Animal> void show(T a) {
        System.out.println("Inside show method " + a.getClass().getName());
    }
}

class Animal {
    public Animal() {
        System.out.println("I'm animal instance");
    }
}

class Cat extends Animal {

    public Cat() {
        System.out.println("I'm Cat. Meow!");
    }
}

class Dog {
    public Dog() {
        System.out.println("I'm not animal instance!");
    }
}
