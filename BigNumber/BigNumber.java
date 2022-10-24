/*
 Java's BigDecimal class can handle arbitrary-precision signed decimal numbers. Let's test your knowledge of them!
 
 Input Format

The first line consists of a single integer,n, denoting the number of integer strings.
Each line i of the n subsequent lines contains a real number denoting the value of Si.

Output Format

Locked stub code in the editor will print the contents of array s to stdout. You are only responsible for reordering the array's elements.
 
 
 
 */

import java.math.BigDecimal;
import java.util.*;
	
	
public class BigNumber {
	
	    public static void main(String []args){
	        
	        Scanner sc= new Scanner(System.in);
	        int n=sc.nextInt();
	        String []s=new String[n+2];
	        for(int i=0;i<n;i++){
	            s[i]=sc.next();
	        }
	        sc.close();
	        
	        for(int i=1;i<n;i++){
	            for(int j=i;j>0;j--){
	                if(new BigDecimal(s[j]).compareTo(new BigDecimal(s[j-1]))>0){
	                    String temp=s[j];
	                    s[j]=s[j-1];
	                    s[j-1]=temp;
	                }else{
	                    break;
	                }
	            }
	        }
	        
	        for(int i=0;i<n;i++)
	        {
	            System.out.println(s[i]);
	        }
	    }
	

}
