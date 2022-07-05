package DemoInterface;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.fly();
        plane.fall();

        Balloon balloon = new Balloon();
        balloon.fly();
        balloon.fall();

        Bird bird = new Bird();
        bird.fly();
        bird.fall();
    }
}
