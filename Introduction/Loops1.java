/*
Objective
In this challenge, we're going to use loops to help us do some simple math.
Task
Given an integer, , print its first  multiples. 
Each multiple  (where ) should be printed on a new line in the form: N x i = result.
Input Format
A single integer, .
Constraints
Output Format
Print  lines of output; each line  (where ) contains the  of  in the form:
N x i = result.
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Loops1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
        if(N<=20 && N>=2){
        for(int i=1;i<=10;i++){
            int a=i*N;
            System.out.print(N+ " " + "x " +i+" " + "= "+ a + "\n");
        }
        System.out.println();
        }
        
        bufferedReader.close();
    }
}
