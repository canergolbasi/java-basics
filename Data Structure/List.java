/*
we have 2 types of queries you can perform on a List:
Insert y at index x:
Insert
x y
Delete the element at index x:
Delete
x
Given a list, L, of N integers, perform Q queries on the list. 
Once all queries are completed, print the modified list as a single line of space-separated integers.

Sample Input
5
12 0 1 78 12
2
Insert
5 23
Delete
0

Sample Output
0 1 78 12 23


 */

import java.util.LinkedList;
import java.util.Scanner;

public class List {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        LinkedList<Integer> list = new LinkedList<Integer>();
        
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        
        for(int i=0;i<n;i++){
            int element=scan.nextInt();
            list.add(element);
        }
        
        int q=scan.nextInt();
        for(int k=0;k<q;k++){
            String type=scan.next();
            
            if(type.equals("Insert")){
                int index=scan.nextInt();
                int element=scan.nextInt();
                list.add(index, element);
            }else if(type.equals("Delete")){
                int index=scan.nextInt();
                list.remove(index);
            }
        }
        
        for(int l=0;l<list.size();l++)
            System.out.print(list.get(l)+" ");
    }
}
