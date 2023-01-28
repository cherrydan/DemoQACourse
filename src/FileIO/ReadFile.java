package FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("out.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            String s = sc.next();
            System.out.println(s);
        }
        sc.close();

    }
}
