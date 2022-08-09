/*
Write a class called MyRegex which will contain a string pattern. 
You need to write a regular expression and assign it to the pattern such that it can be used to validate an IP address.  
Sample Input
000.12.12.034
121.234.12.12
23.45.12.56
00.12.123.123123.123
122.23
Hello.IP
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Regex{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        in.close();

    }  
    
}

class MyRegex{
	   String number="([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
	    public String pattern= number +"."+number+"."+number+"."+number;
	}
