public class Demo4 {
    //Введение в функции
    public static void main(String[] args) {
        myFunction();
        int result = myFunction2();
        System.out.println(result);
    }

    public static void myFunction() {
        System.out.println("Hello World!");
    }

    public static int myFunction2() {
        int sum = 20 + 10;
        return sum;
    }
}
