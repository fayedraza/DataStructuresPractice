package linear;

public class IntLLApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             intNode front = new intNode(35,null);
             intNode second = new intNode(25,front);
	         System.out.println(second.next);
	         
	         stringNode strFront = new stringNode("Everest",null);
	         
	         System.out.println(strFront);
	}

}
