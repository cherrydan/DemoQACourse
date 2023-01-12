package JavaTutor;

public class ToString {

    public static void main(String[] args) {
        String s = new String("abc");
        System.out.println(s);
        System.out.println(s.toString());

        Men men = new Men(1, "John");
        System.out.println(men);
        System.out.println(men.toString());
    }
}
