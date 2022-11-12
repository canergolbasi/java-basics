/*
A subarray of an n-element array is an array composed from a contiguous block of the original array's elements. 
The sum of an array is the total sum of its elements.
An array's sum is negative if the total sum of its elements is negative.
An array's sum is positive if the total sum of its elements is positive.
Given an array of n integers, find and print its number of negative subarrays on a new line.
Sample Input
5
1 -2 4 -5 1
Output Format
Print the number of subarrays of array having negative sums
 */

import java.util.Scanner;


public class SubArray {
	
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
    int n=in.nextInt();    
    
    int[] arr=new int[n];
   
    for(int i=0;i<n;i++) {
    	arr[i]=in.nextInt();
    }
    
    int negativesumcount=0;
    for(int i=0;i<n;i++) {
    	int sum=0;
    	for(int k=i;k<n;k++) {
    		sum=sum+arr[k];
    		if(sum<0) {
    			negativesumcount++;
    		}
    	}
    	
    }
    
    System.out.println(negativesumcount);
    in.close();
    
	}

}
