/*
 A prime number is a natural number greater than 1 whose only positive divisors are 1 and itself. 
 For example, the first six prime numbers are 2, 3, 5, 7, 11, and 13.
 
 Input Format

A single line containing an integer,n  (the number to be checked).

Output Format

If n is a prime number, print prime; otherwise, print not prime.
 */

import java.io.*;
import java.math.*;



public class PrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();
        BigInteger a; 
        a = new BigInteger(n);        
        
        if(a.isProbablePrime(1)){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
        
    }
}
