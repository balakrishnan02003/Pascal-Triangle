import java.util.Scanner;

public class Pascal_Triangle_Loop
 {
  
    public static void main(String[] args) {
      int i,j,n,result;

      System.out.println("Pascal Traingle");
      System.out.println("---------------");

        Scanner s= new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
         n = s.nextInt();
        
        for (i=0; i<n; i++)   // This loop controls the number of rows.
         {
             result= 1;            // First value in every line of the pascal triangle is 1.
             
            for (j=0; j<n-i; j++)  // This loop controls the initial spaces.
            {
                System.out.print("  ");
            }
            
            
            for (j= 0; j<= i; j++)  // This loop controls the values in the pascal triangle.
             {
                System.out.print(result+ "   ");
                result = result * (i-j) /(j+1);
             }
            System.out.println();
        }
    }
}

