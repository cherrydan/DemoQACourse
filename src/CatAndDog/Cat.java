package CatAndDog;

public class Cat extends Animal implements CheckingMethods {

    public void meow() {
        System.out.println("Кошка мяукает...");
    }

    @Override
    public void checkFull() {
        if(getHungry() == "нет") {
          meow();
            System.out.println("Кошка больше не хочет есть. Она сытая.");
        }
    }
}
