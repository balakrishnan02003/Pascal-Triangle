import java.util.Scanner;
public class Pascal_Triangle_Recursion {
    public static void main(String[] args) {
        System.out.println("Pascal Triangle");
      System.out.println("---------------");

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = s.nextInt();

        
        for (int i = 0; i < n; i++)  // Controls the number of rows of the Pascal triangle.
        {
            
            for (int j=0; j < n-i-1; j++)   // To print the initial space.
            {
                System.out.print(" ");
            }

            
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal(i, j) + " "); // To print elements of the current row.
            }

            System.out.println();
        }
    }
    
    public static int pascal(int row, int col)
    {
        if (col == 0 || col == row)
        {
            return 1;       //  1st and last element of each and every row is 1.
        } 
        else 
        {
            return pascal(row - 1, col - 1) + pascal(row - 1, col);  //  Sum of two elements above current element
        }
    }
}



    