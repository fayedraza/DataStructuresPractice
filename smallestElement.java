package interviewPrep;

import java.util.Arrays;
//Created by Fayed Raza on 12/28/2019
public class smallestElement {
    public static int kthSmallestElement(int a[], int k) {
    	Arrays.sort(a); //sort the array 
    	
    	return a[k-1]; //returns the kth smallest element
    }
    
    
    public static void main (String[]args)
    {
    	int a[]= {7,10,4,3,20,15};
    	System.out.println(kthSmallestElement(a,4));
    	
    	
    	
    	
    	
    	
    }
}
