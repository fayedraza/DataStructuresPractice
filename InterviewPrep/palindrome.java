package CS111;
//created by Fayed Raza on 12/26/2019
public class palindrome {

	public static boolean isPalindrome(String s) {
		if(s.length() <= 1)  //base case (if the length is less than 1)
			return true;
		if(s.charAt(0) != s.charAt(s.length()-1))  //compares the first and last letter
			return false;
		else
			return isPalindrome(s.substring(1,s.length()-1));  //recursion, passes the string with the first and last letter taken off
	}
	
	
	//Time Complexity: O(n^2) nested for loop
   //Space Complexity: O(n)
	public static String longestPalindrome(String s) {
		String longestString = "";
		for(int x=0; x<s.length(); x++) {
			for(int y=0; y<x; y++) {
					//checks if this is a palindrome and if this is the longest palindrome yet
				if( isPalindrome(s.substring(y,x+1)) && (longestString.length() < s.substring(y, x+1).length()) ) { 
					longestString = s.substring(y,x+1);
				}
			}
	
		}
		     return longestString;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main (String[]args) {
		
		System.out.println(longestPalindrome("abaxyzzyxf"));
	}
	
}
