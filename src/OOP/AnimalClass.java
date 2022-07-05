package OOP;

public class AnimalClass {
    //общий предок может быть голодным
    private boolean hungry;

    public void setHungry() {
        hungry = true;
        System.out.println("Животное проголодалось!");
    }

    //общий предок может есть, но не может кормить
    public boolean eat() {
        if(hungry) {
            hungry = false;
        }
        else {
            hungry = true;
        }
        return hungry;
    }

}
