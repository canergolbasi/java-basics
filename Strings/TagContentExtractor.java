/*
 Given a string of text in a tag-based language, parse this text and retrieve the contents enclosed within sequences of well-organized tags meeting the following criterion:
The name of the start and end tags must be same. 
The HTML code <h1>Hello World</h2> is not valid, because the text starts with an h1 tag and ends with a non-matching h2 tag.
Tags can be nested, but content between nested tags is considered not valid. 
For example, in <h1><a>contents</a>invalid</h1>, contents is valid but invalid is not valid.
Tags can consist of any printable characters.

Sample Input
4
<h1>Nayeem loves counseling</h1>
<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
<Amee>safat codes like a ninja</amee>
<SA premium>Imtiaz has a secret crush</SA premium>
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TagContentExtractor{
	public static void main(String[] args){
		Pattern pattern=Pattern.compile("<([^>]+)>([^<>]+)</\\1>");
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			Matcher match=pattern.matcher(line);
            boolean b=true;
            
            while(match.find()){
                System.out.println(match.group(2));
                b=false;
            }
            if(b){
                System.out.println("None");
            }         	
			
			testCases--;
		}
	}
}



