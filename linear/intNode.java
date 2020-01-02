package linear;

public class intNode {
   
	public int data; 
	

	
	public intNode next;
	
	public intNode(int data, intNode next) {
		this.data = data;
		this.next = next;
	}
	
	public String toString() {
		return data + "";
	}
	
}
