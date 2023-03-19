/*
Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"
Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.
Given a string, determine if it is balanced or not.
Sample Input
{}()
({()})
{}(
[]
Sample Output
true
true
false
true
 */

import java.util.*;
class JavaStack{    
    
    public static boolean control(String str){
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='{') stack.push('{');
            else if (str.charAt(i) == '(') stack.push('(');
            else if (str.charAt(i) == '[') stack.push('[');
            else if (str.charAt(i) == '}') {
                if (stack.isEmpty()) return false;
                if (stack.pop() != '{') return false;
            }
            else if (str.charAt(i) == ')') {
                if (stack.isEmpty()) return false;
                if (stack.pop() != '(') return false;
            }
            else if (str.charAt(i) == ']') {
                if (stack.isEmpty()) return false;
                if (stack.pop() != '[') return false;
            }
        }
        return stack.isEmpty();
    }
	
    
	public static void main(String []argh){
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextLine()) {
			String input=sc.next();
            if(control(input)) System.out.println("true");
            else System.out.println("false");            
		}
		
	}
}



