import java.util.*;
public class GuessNumber2 {
    public static void main(String[] args) {
      int a = (int)(Math.random() * 20);
      //System.out.println(a);
      int b;
      System.out.println("Компьютер загадал некое число...");
      Scanner in = new Scanner(System.in);
      do {
        System.out.print("Введите ваше число  --> ");  
        b = in.nextInt();
        if (a > b)  {
      
            System.out.println("Мало!");
        
          }
          else if (a == b) {
            System.out.println("Вы угадали!");
    
          }
          else {
            System.out.println("Много!");
        }
      }
      while(a != b);


     in.close(); 
  }
}

