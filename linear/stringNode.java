package linear;

public class stringNode {
   
	public 	String data; 

	
	public stringNode next;
	
	public stringNode(String data, stringNode next) {
		this.data = data;
		this.next = next;
	}
	
	public String toString() {
		return data + "";
	}
	
}
