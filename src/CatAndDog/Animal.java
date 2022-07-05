package CatAndDog;

public class Animal {

    //общий предок может быть голодным
    private String hungry;

    public void setHungry() {
        hungry = "да";
        System.out.println("Животное проголодалось!");
    }

    public String getHungry() {
        return hungry;
    }

    //общий предок может есть, но не может кормить
    public String eat() {
        if(hungry == "да") {
            this.hungry = "нет";
        }
        return hungry;
    }

}
