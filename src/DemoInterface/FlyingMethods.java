package DemoInterface;

public interface FlyingMethods {
    //метод fly реализован внутри интерфейса
    default void fly() {
        System.out.println("Летит!");
    }

    //метод fall не реализован внутри интерфейса
    void fall();
}
