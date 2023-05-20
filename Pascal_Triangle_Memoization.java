import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pascal_Triangle_Memoization {
   
    private static Map<String, Integer> cache = new HashMap<>();  // Map is used to store multiple values with the help of a key.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) 
        {
            
            for (int j = 0; j < num-i-1; j++)  // To print the initial space.
            {
                System.out.print(" ");
            }

            
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal(i, j) + " ");  // To print elements of the current row.
            }

            System.out.println();
        }
    }

    public static int pascal(int row, int col)
    {
        String key = row + "-" + col;     // To check if the value is already stored in the cache.
        if (cache.containsKey(key))
         {
            return cache.get(key);
         }

        
        if (col == 0 || col == row)   //  first and last element of each and every row is 1.
        {
            return 1;
        }

        int result = pascal(row - 1, col - 1) + pascal(row - 1, col);  // sum of two elements above current element.

        cache.put(key, result);    // To store the computed value in the cache.
        return result;
    }
}



