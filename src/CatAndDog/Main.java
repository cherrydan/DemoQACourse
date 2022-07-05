package CatAndDog;

public class Main {

    public static void main(String[] args) {
        Human vasya = new Human();
        Cat cat = new Cat();
        Dog dog = new Dog();

        //Засунул в интерфейс разную реакцию разных животных на кормление
        cat.setHungry();
        vasya.feed(cat);
        cat.checkFull();

        System.out.println();
        dog.setHungry();
        vasya.feed(dog);
        dog.checkFull();
    }
}
