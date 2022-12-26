package JavaTutor;

public class TestCloneable {
    public static void main(String[] args) {
        Men men1 = new Men(3, "Jack");
        Men men2;
        men2 = men1;
        men1.setId(10);
        System.out.println(men1.getId());
        System.out.println(men2.getId());

    }
}
