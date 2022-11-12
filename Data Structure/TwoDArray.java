/*
You are given a  2D array. An hourglass in an array is a portion shaped.
1 1 1     1 1 0     1 0 0
  1         0         0
1 1 1     1 1 0     1 0 0
The sum of an hourglass is the sum of all the numbers within it. 
The sum for the hourglasses above are 7, 4, and 2, respectively.
In this problem you have to print the largest sum among all the hourglasses in the array.

Input Format
There will be exactly  lines, each containing  integers seperated by spaces. Each integer will be between  and  inclusive.
Output Format
Print the answer to this problem on a single line.
 */

import java.io.*;
import java.util.*;


public class TwoDArray {
    public static void main(String[] args) throws IOException {
       Scanner in=new Scanner(System.in);
       
       int arr[][]=new int[6][6];
       
       for(int i=0;i<6;i++) {
    	   for(int k=0;k<6;k++) {
    		   arr[i][k]=in.nextInt();
    	   }
       }
       
       int sum_max=Integer.MIN_VALUE;
       
       for(int i=0;i<4;i++) {    	   
    	   for(int k=0;k<4;k++) {
    		   int sum=arr[i][k] + arr[i][k+1] + arr[i][k+2] 
    				   + arr[i+1][k+1] 
    				   + arr[i+2][k] + arr[i+2][k+1] + arr[i+2][k+2] ;
    		   if(sum>sum_max) {
        		   sum_max=sum;
        	   }    		   
    	   }  
    	   
       }
       
       System.out.println(sum_max);

        
    }
}
