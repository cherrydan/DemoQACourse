package Demo;

public class Main {
    public static void main(String[] args) {
        Animal newAnimal = new Animal();
        //Переименуем Ваську в Мурку при помощи сеттера
        newAnimal.setName("Мурка");
        //Представим котика
        System.out.printf("Ноги: %d\nИмя: %s\n\n", newAnimal.getLegs(), newAnimal.getName());
        System.out.println("Голодный? = " + newAnimal.getHungry());
        newAnimal.eat();
        System.out.println("\nГолодный? = " + newAnimal.getHungry());
        //пытаемся накормить сытого
        newAnimal.eat();
    }
}
