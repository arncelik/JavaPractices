import java.util.*;
 class MeanAndStDev{
   int i;
   int a;
 public static void main (String [] args){
      System.out.println("How many integers do you want enter ?");
      Scanner scan = new Scanner (System.in);
      int a = scan.nextInt();
      while (a>20){
        System.out.println("ERROR! Please enter at most 20 integers : ");
      }
      System.out.println("Please enter at most 20 integers: ");
      double[] arr= new double [a];
      double sum=0, mean=0;

      for (int i=0; i<a; i++){
           arr[i]=scan.nextDouble();
           sum+=arr[i];
      }
      mean=sum/a;
      sum=0;
      System.out.println("Mean : "+mean);
      double [] temp= new double[a];

      for (int i=0; i<a; i++){ 
           temp[i]=Math.pow((arr[i]-mean),2);
           sum+=temp[i];
      }
      mean=sum/a;
      double deviation=Math.sqrt(mean);
      System.out.println("Standard Deviation : "+ deviation);
  }
 }
