import java.util.Scanner;

public class SNB_03_Getting_User_Input 
  {
      public static void main(String[] args)
        {
             Scanner sc = new Scanner(System.in);
             
             System.out.println("Enter a number: ");
             int num1 = sc.nextInt();
             System.out.println("Enter a number: ");
             int num2 = sc.nextInt();

             System.out.println("Sum of two number is : ");
             System.out.println(num1 + num2); 
             
             String str = sc.next();
             System.out.println("String is : " + str);
        }
  }
