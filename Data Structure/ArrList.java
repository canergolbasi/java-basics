
/*
 Sometimes it's better to use dynamic size arrays. 
 Java's Arraylist can provide you this feature. 
 Try to solve this problem using Arraylist.
You are given n lines. 
In each line there are zero or more integers. 
You need to answer a few queries where you need to tell the number located in yth position of xth line.
Take your input from System.in.
Input Format
The first line has an integer n.
In each of the next n lines there will be an integer d denoting number of integers on that line and then there will be d space-separated integers.
In the next line there will be an integer q denoting number of queries. 
Each query will consist of two integers x and y.
Sample Input
5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
Sample Output
74
52
37
ERROR!
ERROR!
 
 */

import java.util.ArrayList;
import java.util.Scanner;
public class ArrList {

	public static void main(String[] args) {
		
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> sublist=new ArrayList();
        	
        	int d=scan.nextInt();
            for(int j=0;j<d;j++) {
            	int integers=scan.nextInt();
            	sublist.add(integers);
            }
            list.add(sublist);            
        }
        
        int number_of_print=scan.nextInt();
        for(int k=0;k<number_of_print;k++) {
        	int row=scan.nextInt();
        	int col=scan.nextInt();
        	
        	try {
        		System.out.println(list.get(row-1).get(col-1));
        	}catch(Exception e) {
        		System.out.println("ERROR!");
        	}
        	
        	
        }

        scan.close();
	}

}
