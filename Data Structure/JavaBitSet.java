/*
Sample Input
5 4
AND 1 2
SET 1 4
FLIP 2 2
OR 2 1
Sample Output
0 0
1 0
1 1
1 2
 */
import java.io.*;
import java.util.*;

public class JavaBitSet {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner input=new Scanner(System.in);
        int N=input.nextInt();
        int M=input.nextInt();
        
        BitSet b1=new BitSet(N);
        BitSet b2=new BitSet(N);
        BitSet[] bitset = new BitSet[3];
        
        bitset[1]=b1;
        bitset[2]=b2;
        
        while(M!=0)
        {
            String operation=input.next();
            int a=input.nextInt();
            int b=input.nextInt();
            
            switch(operation){
                case "AND":
                bitset[a].and(bitset[b]);
                break;
                case "SET":
                bitset[a].set(b);
                break;
                case "FLIP":
                bitset[a].flip(b);
                break;
                case "OR":
                bitset[a].or(bitset[b]);
                break;
                case "XOR":
                bitset[a].xor(bitset[b]);
                break;
                
            }
           System.out.println(b1.cardinality() + " " + b2.cardinality());
           M--; 
        }
        
    }
}

