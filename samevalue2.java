import java.util.Scanner;

public class samevalue {
   public static void main(String[] args) {
      int num1;
      double num2, result1, result2;

      Scanner keyboard = new Scanner(System.in);

      System.out.println("enter first number");

      num1= keyboard.nextInt();

      System.out.println("enter second number");

      num2 = keyboard.nextDouble();

      result1=(double) num1/5;
      System.out.println(result1);

      result2=(double) num2/5;
       System.out.println(result2);
     }
}








