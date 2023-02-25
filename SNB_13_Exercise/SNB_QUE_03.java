package SNB_13_Exercise;

import java.util.Scanner;

public class SNB_QUE_03
   { 
       public static void main(String[] args)
         {
              int num1 = 10;
              Scanner Sc = new Scanner(System.in);
              System.out.println("Enter the number : ");
              int num2 = Sc.nextInt();
                if(num1 >  num2)
                  {    
                    System.out.println("The num1 is greater than num2");
                  }
                else
                 {
                    System.out.println("The num1 is not greater than num2");

                 }
         }
   }
