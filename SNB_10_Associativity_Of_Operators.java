 public class SNB_10_Associativity_Of_Operators
  {
       public static void main(String[] args)
         {
             int x = 50 , y = 100 ;
             int A =  (x-y)/2 ;
             System.out.println(A);
             
             int a = 10 ;
             int b = 20 ;
             int c = 30 ;
             int d = 100 ;
             int B = (b*b)- 4 * a * c ;
             System.out.println(B);
            
            float v = 100.1f ;
            float u = 20.20f ;
            float C = (v * v) - (u * u) ;
            System.out.println(C);

            int D = a * b - d ;
            System.out.println(D);
         }
  }