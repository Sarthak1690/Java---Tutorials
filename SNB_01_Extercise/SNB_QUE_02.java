import java.util.Scanner;

public class SNB_QUE_02
  {
    public static void main(String[] args)
      {
        System.out.println("Find CGPA of a student");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of Sub 1 : ");
        float sub1 = sc.nextFloat();

        System.out.print("Enter the marks of Sub 2 : ");
        float sub2 = sc.nextFloat();

        System.out.print("Enter the marks of Sub 3 : ");
        float sub3 = sc.nextFloat();

        float CGPA = (sub1 + sub2 + sub3) / 30;
        System.out.println("CGPA = " + CGPA);
      }
  }
