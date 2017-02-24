import java.util.Scanner;
 
class tempconvert {
  public static void main(String[] args) {
    float temp;
    Scanner in = new Scanner(System.in);      
 
    
    temp = in.nextInt();
    temp = ((temp- 32)*5)/9;

    System.out.println("Temperatue in Celsius = " + temp);
  }
}
