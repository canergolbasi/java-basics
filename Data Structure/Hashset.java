/*

You are given n pairs of strings.
Two pairs (a,b) and (c,d) are identical if a=c and b=d. 
That also implies (a,b) is not same as (b,a). 
After taking each pair as input, you need to print number of unique pairs you currently have.
Sample Input
5
john tom
john mary
john tom
mary anna
mary anna
Sample Output
1
2
2
3
3 
 
 */


import java.util.*;


public class Hashset {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

    HashSet<String> person = new HashSet<String>();
    for(int k=0;k<t;k++){
        person.add(pair_left[k] + " " + pair_right[k]);
        System.out.println(person.size());        
    }
    
    
   }
}