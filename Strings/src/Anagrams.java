/*
 Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string
Returns

boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false.
  
 
 */





import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a=a.toLowerCase();
        b=b.toLowerCase();
        
        
        Anagrams first=new Anagrams();
        String c=first.orderly(a);
        String d=first.orderly(b);
        
        if(c.equals(d)){
            return true;
        }else{
            return false;
        }
        
        
    }
    
    public String orderly(String s){
    	 char arr[] = s.toCharArray();
    	 
    	    char temp;
    	    
            int i = 0;
            while (i < arr.length) {
                int j = i + 1;
                while (j < arr.length) {
                    if (arr[j] < arr[i]) {
                       
                        // Comparing the characters one by one
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                    j += 1;
                }
                i += 1;
            }
        String result=new String(arr);
        return result;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
