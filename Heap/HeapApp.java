package tree;

import java.util.Scanner;

public class HeapApp {

	
	
	public static void main (String[]args) {
		Heap<Integer> hp = new Heap<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Add a number. If you are done type done");
		String line  = sc.next();
		while(!line.equalsIgnoreCase("done")) {
			hp.insert(Integer.parseInt(line));
			System.out.println(hp);
			System.out.println("Add a number. If you are done type done");
			line = sc.next();
		}
		
		while(!hp.isEmpty()) {
			int max  = hp.delete();
			System.out.println(max +" "+ hp);
		}
	}
}
