package linear;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Movies {

	
	
	public static void main (String[]args) 
{
	stringNode front = null;
	System.out.println(front);
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter a movie name: ");
	String movies = scan.nextLine();
	front= addToFront(front,movies);
	System.out.println("added " + front);
	
	System.out.println("Enter a movie name: ");
    movies = scan.nextLine();
   
    front= addToFront(front,movies);
	System.out.println("added " + front);
	
	try {
	front= deleteFront(front);
	System.out.println("List: " + front);
	
	front= deleteFront(front);
	System.out.println("List:  " + front);
	
	front= deleteFront(front);
	System.out.println("List: " + front);
	}catch(NoSuchElementException e) {
		System.out.println("No such element");
	}
}
	public static stringNode addToFront(stringNode front, String movie) {
	
		stringNode temp = new stringNode(movie,null);
		
		temp.next = front;   //next node of temnp to front
		return temp;      //set front to temp
		
		
		
			}
	
	public static stringNode deleteFront(stringNode front)  {
		
		if(front == null)
			throw new NoSuchElementException();
			return front.next;
	}
}