package Demo;
//Класс - животное
public class Animal {

    //поля
   private int legs = 4;
   private String name = "Васька";

   private boolean hungry = true;

    //свойства = геттеры и сеттеры

    public int getLegs() {
        return this.legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getHungry() {
        return this.hungry;
    }

    //Поведение - методы
    public void eat() {
        if(this.hungry) {
            System.out.printf("%s кушает...\n", this.name);
            this.hungry = false;
        }
        else {
            System.out.println("Животное сытое!");
        }
    }

}
