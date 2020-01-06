package tree;

import java.util.ArrayList;
import java.util.Scanner;

public class MinMaxHeap {
public static void main (String[]args) {
	Scanner scan = new Scanner(System.in);
	String input = "";
	ArrayList<Integer> maxHeap = new ArrayList<Integer>();
	while(true) {
		System.out.println("Input a number or type done if you are finished: ");
		input = scan.nextLine();
		if(input.equalsIgnoreCase("done")) {
			System.out.println(isMinHeap(maxHeap,0));
			return;
		}else {
			maxHeap.add(Integer.parseInt(input));
		}
	}
		
		
}
public static boolean isMaxHeap(ArrayList<Integer> t, int posistion) {
	
	int parent = t.get(posistion);
	if((2*posistion +1 >= t.size()) && 2*posistion +2 >= t.size()) {
		
	}else if(2*posistion +2  >= t.size()) {
		int child1 = t.get(2*posistion +1);
		
	    if(parent < child1) {
			return false;
		}else {
			return isMaxHeap(t,2*posistion +1); 
			 
		}
	}else if(2*posistion +1 >= t.size()) {
		int child2 = t.get(2*posistion +2);
	 
		if(parent  < child2) {
			return false;
		}else {
			return isMaxHeap(t,2*posistion +2); 
		}
	}else {
	int child1 = t.get(2*posistion +1);
	int child2 = t.get(2*posistion +2);
 
	if(parent < child1 || parent < child2) {
		return false;
	}else {
		return isMaxHeap(t,2*posistion +1) && isMaxHeap(t,2*posistion +2); 
		 
	}
	
	}
	
	
	
	
	return true;
}
public static boolean isMinHeap(ArrayList<Integer> t, int posistion) {
	
	int parent = t.get(posistion);
	if((2*posistion +1 >= t.size()) && 2*posistion +2 >= t.size()) {
		
	}else if(2*posistion +2  >= t.size()) {
		int child1 = t.get(2*posistion +1);
		
	    if(parent > child1) {
			return false;
		}else {
			return isMinHeap(t,2*posistion +1); 
			 
		}
	}else if(2*posistion +1 >= t.size()) {
		int child2 = t.get(2*posistion +2);
	 
		if(parent > child2) {
			return false;
		}else {
			return isMinHeap(t,2*posistion +2); 
		}
	}else {
	int child1 = t.get(2*posistion +1);
	int child2 = t.get(2*posistion +2);
 
	if(parent > child1 || parent > child2) {
		return false;
	}else {
		return isMinHeap(t,2*posistion +1) && isMinHeap(t,2*posistion +2); 
		 
	}
	
	}
	
	
	
	
	return true;
}
}
