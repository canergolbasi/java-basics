/*
We use the integers , , and  to create the following series:
You are given q queries in the form of a, b and n. For each query, print the series corresponding to the given a, b, and n values as a single line of n space-separated integers.
Sample Input
2
0 2 10
5 3 5
Sample Output
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
 */

import java.util.*;
import java.io.*;

class Loops2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int total=0;
            
                total=total+a;
                
                for(int l=0;l<n;l++){
                    total=total+((int)Math.pow(2,l))*b;
                    System.out.print(total);
                    System.out.print(" ");
                }
                
                
            
            System.out.println();
            in.close();
                
           
        }
        
        
    }
    

}
