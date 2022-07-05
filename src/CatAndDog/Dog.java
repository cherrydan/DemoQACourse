package CatAndDog;

public class Dog extends Animal implements CheckingMethods {
    public void bark() {
        System.out.println("Собака лает...");
    }

    @Override
    public void checkFull() {
        if(getHungry() == "нет") {
            bark();
            System.out.println("Собака просит ещё поесть.");
        }

    }
}
