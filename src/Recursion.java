public class Recursion {
//рекурсия
public static void main(String[] args) {
recFunction("World");
}

public static void recFunction(String word) {
    if (word == "World") {
        recFunction("Hello");
    }
    System.out.println(word);
}

}
