/*
Let's play a game on an array! 
You're standing at index 0 of an n-element array named game.
From some index i (where 0<=i<n), you can perform one of the following moves:
Move Backward: If cell i-1 exists and contains a 0, you can walk back to cell i-1.
Move Forward:
If cell i+1 contains a zero, you can walk to cell i+1.
If cell i+leap contains a zero, you can jump to cell i+leap.
If you're standing in cell n-1 or the value of i+leap>=n, you can walk or jump off the end of the array and win the game.
In other words, you can move from index i to index i+1, i-1, or i+leap as long as the destination index is a cell containing a 0.
If the destination index is greater than n-1, you win the game.
Sample Input
STDIN           Function
-----           --------
4               q = 4 (number of queries)
5 3             game[] size n = 5, leap = 3 (first query)
0 0 0 0 0       game = [0, 0, 0, 0, 0]
6 5             game[] size n = 6, leap = 5 (second query)
0 0 0 1 1 1     . . .
6 3
0 0 1 1 1 0
3 1
0 1 0
Sample Output
YES
YES
NO
NO
 */

import java.util.*;

public class OneDArray2 {

    public static boolean canWin(int leap, int[] game, int i) {
        // Return true if you can win the game; otherwise, return false.
        if(i<0 || game[i]==1){
            return false;
        }
        if(i+1>=game.length || i+leap>=game.length){
            return true;
        }
        game[i]=1;
        
        return canWin(leap,game,i+1) || canWin(leap,game,i+leap) ||  canWin(leap,game,i-1);
        
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game,0)) ? "YES" : "NO" );
        }
        scan.close();
    }
}