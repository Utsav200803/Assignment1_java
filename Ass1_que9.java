
 /*UTSAV GUNADARANIYA- 21CE037 
 
The problem is to check whether a given Sudoku solution is correct.*/

import java.util.*;
public class Ass1_que9 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        final int r = 9;
        final int c = 9;
        int arr[][]= new int[r][c];

        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
                arr[i][j] = obj.nextInt(); 
            }
        }

        obj.close();
    }
}