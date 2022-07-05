package OOP;

public class MainProgram {
    public static void main(String[] args) {
        Human vasya = new Human();
        AnimalClass cat = new AnimalClass();
        AnimalClass dog = new AnimalClass();
        cat.setHungry();
        vasya.feed(cat);
        dog.setHungry();
        vasya.feed(dog);
        vasya.feed(cat);
    }

}
