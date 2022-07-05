package DemoInterface;

public class Bird implements FlyingMethods {

    Boolean hungry;
    //Перезагрузка метода обязательна для класса, который берёт интерфейс
    @Override
    public void fall() {
        System.out.println("Берегись!!!");
    }
}
