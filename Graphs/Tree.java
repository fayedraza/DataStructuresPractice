public class Tree {
      Tree left, right;
      int data;
      public Tree(int data) {
    	 this.data = data; 
      }
      
      public void insert(int value) {
    	  if(value <= data) {
    		  if(left == null)
    			  left = new Tree(value);
    		  else
    			  left.insert(value);
    			  
    	  }else {
    		  if(right == null) {
    			  right = new Tree(value);
    		  }else {
    			  right.insert(value);
    		  }
    	  }
      }
      
      
      
      public boolean contains(int value) {
    	  if(value == data) {
    		  return true;
    	  }else if(value < data ) {
    		if(left == null)
    			return false;
    		else   
    			return left.contains(value);
    	  }else {
    		if(right == null)
    			return false;
    		else
    			return right.contains(value);
    	  }
      }
    	  
    	  public void printInOrder() {
    		  if(left!= null) {
    			  left.printInOrder();
    		  }
    		  System.out.print(data +"->");
    		  if (right != null) {
    			  right.printInOrder();
    		  }
    	  
    	  } 
    	  
    	  
		

		public static void main(String[]args) {
    		Tree binaryTree = new Tree(7);
    		
    		binaryTree.insert(3);
    		binaryTree.insert(9);
    		binaryTree.insert(4);
    		
    		binaryTree.printInOrder();
    		
    	}
    	  
    	  
    	  
    	  
    	       }
