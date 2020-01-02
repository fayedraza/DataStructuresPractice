//created by Fayed Raza on 12/26/2019
package StacksAndQueues;

import java.util.*;

public class parenthesisChecker {
	
	//Time complexity: O(n)
	//Space Complexity: O(n)
	public static boolean checkIsTogether(String s) {
	     if(s.length()%2 != 0)	//it has to be an even length or there is/are missing pairs
	    	 return false;
	     
	     Stack<Character> half = new Stack<Character> ();
	     Stack<Character> half2 = new Stack<Character> ();
	     
	     for(int x=0; x<s.length()/2; x++) { //takes the first half of the string
	    	 half.push(s.charAt(x));
	    	
	     }
	

	     for(int x=s.length()-1; x>=s.length()/2; x--) { //takes the second half of the string
	    	 half2.push(s.charAt(x));
	    	
	    	 
	     }
	    
	     if( (half.peek() == '(' )  && (half2.peek() == ')' )) {  //checks if the top of the stacks are pairs or not
	    	 half.pop();
	    	 half2.pop();
	     }else if( (half.peek() == '[' )  && (half2.peek() == ']' )) {
	    	 half.pop();
	    	 half2.pop();
	     }else if( (half.peek() == '{' )  && (half2.peek() == '}' )) {
	    	 half.pop();
	    	 half2.pop();
	     }else {
	    	return false;
	     } 
	    
	    
		
		return true;
	}
	
	

	public static void main (String[]args) {
		System.out.println(checkIsTogether("[({})]"));
		
		
	}
}
