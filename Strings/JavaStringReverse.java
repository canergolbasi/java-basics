/* 
 A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string , print Yes if it is a palindrome, print No otherwise.
  */





import java.util.*;

public class JavaStringReverse {

        
    public boolean reverse(String A){
    	
    	  boolean iseq=true;
          for(int k=0;k<A.length()/2+1;k++){
              char a1=A.charAt(k);
              char a2=A.charAt(A.length()-1-k);
              
              if(a1!=a2){
                iseq=false;
            }     
              
          }          
    	return iseq;
    }
    
    
    
public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
        JavaStringReverse result=new JavaStringReverse();
                
        if(result.reverse(A)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
    
}



