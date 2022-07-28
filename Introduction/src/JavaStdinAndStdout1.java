/*
 Most Java challenges require you to read input from stdin (standard input) and write output to stdout (standard output).
One popular way to read input from stdin is by using the Scanner class and specifying the Input Stream as System.in. 
Sample Input
42
100
125
Sample Output
42
100
125
 */

import java.util.*;

public class JavaStdinAndStdout1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        // Complete this line
        int b=scan.nextInt();
        int c=scan.nextInt();
        // Complete this line

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        // Complete this line
        // Complete this line
    }
}