package OOP;

public class Human {

    //человек может кормить другое животное
    public void feed(AnimalClass animal) {
        if(!animal.eat()) {
            System.out.println("Животное покормили");
        }
        else {
            System.out.println("Животное не хочет есть");
        }
    }
}
