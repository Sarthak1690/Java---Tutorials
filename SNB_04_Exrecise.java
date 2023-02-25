import java.util.Scanner;

public class SNB_04_Exrecise
   {
      public static void main(String[] args)
       {
            System.out.println("--------------------------------------------------");
            System.out.println("CBSE Results");
            System.out.println("--------------------------------------------------");


            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Name of students: ");
            String name = sc.nextLine();

            System.out.print("Enter the marks of Sub1 : ");
            int Sub1 = sc.nextInt();

            System.out.print("Enter the marks of Sub2 : ");
            int Sub2 = sc.nextInt();

            System.out.print("Enter the marks of Sub3 : ");
            int Sub3 = sc.nextInt();

            int Result = (Sub1 + Sub2 + Sub3)/3;
            System.out.println(name + " : " + Result);

       }
   }
