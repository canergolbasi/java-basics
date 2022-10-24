/*
Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
We define a token to be one or more consecutive English alphabetic letters. 
Then, print the number of tokens, followed by each token on a new line.
 
Sample Input
He is a very very good boy, isn't he?
*/

import java.util.*;

	public class StringToken {

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        
	        scan.close();
	        s = s.trim();
	                  
	        if(s.length()==0){
	            System.out.println(0);
	        }else{          
		        String[] str = s.split("[!,?._'@ ]+");
		        System.out.println(str.length);
		        for(String ss: str){
		            System.out.println(ss);
		        }
	        }
	        
	    }
	}
	
	

