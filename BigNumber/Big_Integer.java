/*
In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like a long integer.

Use the power of Java's BigInteger class and solve this problem.

Output Format

Output two lines. The first line should contain a+b , and the second line should contain a*b. Don't print any leading zeros.
 */



import java.io.*;
import java.util.*;
import java.math.*;

public class BigInteger {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
       Scanner in = new Scanner(System.in);
      BigInteger i = in.nextBigInteger();
      BigInteger b = in.nextBigInteger();
      System.out.println(i.add(b));
      System.out.println(i.multiply(b));
      in.close();
    }
}