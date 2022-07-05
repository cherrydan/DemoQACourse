package DemoInterface;

public class Plane implements FlyingMethods {

    int age;
    //Перезагрузка метода обязательна для класса, который берёт интерфейс
    @Override
    public void fall() {
        System.out.println("Тревога!!!");
    }

}
