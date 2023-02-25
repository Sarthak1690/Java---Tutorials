import java.util.Scanner;

public class SNB_QUE_04 
  {
     public static void main(String[] args)
       {
          System.out.println("Enter a amout of kilometers");
          Scanner sc = new Scanner(System.in);
          double km = sc.nextDouble();

          double miles = km * 0.621371;
          System.out.println("The amout of miles is " + miles);
       }

  }
