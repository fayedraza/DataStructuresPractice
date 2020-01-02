 package interviewPrep;

import java.util.ArrayList;
//created by Fayed Raza on 12/27/2019
public class maxAmount {

	private static String toBinary(int n) {
		if(n==0)
			return "0";
		
		if(n%2 ==0) {
			return toBinary(n/2) + "0";
		}else if (n%2==1) {
			 return toBinary(n/2) + "1";
		}
		
		return null;
	}
	private static boolean isConsecutive(String s) {
		for(int x=0; x<s.length()-1;x++) {
			if((s.charAt(x)=='1') && (s.charAt(x+1) == '1')) {
				return true;
			}
		}
		
		return false;
	}
	private static boolean ridOfo(String s, int n) {
		if(s.length() == n)
			return true;
		
		if(s.startsWith("1")) {
			return false;
		}else {
			return ridOfo(s.substring(1,s.length()),n);
		}
		
		
		
		
	}
	
	//Time complexity: O(n)
	//Space complexity: 0(n)
	public static int findMaxBinary(int n) {
		ArrayList binaryStrings = new ArrayList(); //make an array list for the saved values
	count:	for(int x=0; x<=Integer.MAX_VALUE; x++) {
			String binaryValue = toBinary(x);
			
			if(binaryValue.length() > n) { //check if it is bigger than the value n
				//check if there are any unecessary 0s and if it is consecutive
				if(ridOfo(binaryValue, n) && !(isConsecutive(binaryValue))) {
					binaryStrings.add(binaryValue);
				}else {
				
				break count;
				}
			}else{ 
				
				//check if it is consecutive
				if(isConsecutive(binaryValue)) {
					
				}else  {
                  
					binaryStrings.add(binaryValue);
				}
				
				
				
			}
			
			
		}
		
		//return the size of the array list
		return binaryStrings.size();
	}
	
	
	public static void main (String []args) {
		System.out.println(findMaxBinary(5));
	}
	
	
	
	
	
	
	
	
	
	
}
