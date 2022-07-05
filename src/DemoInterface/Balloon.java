package DemoInterface;

public class Balloon implements FlyingMethods {

    String color;
    //Перезагрузка метода обязательна для класса, который берёт интерфейс
    @Override
    public void fall() {
        System.out.println("Нужно купить новый шарик!");
    }

}
