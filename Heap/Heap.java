 package tree;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Heap<T extends Comparable<T>> {  //array list object
	
	private ArrayList<T> items;  //name it as ArrayList<name>
	
	public Heap() { //declares array list object
		items = new ArrayList<T>();
	}
	
	public void insert(T item) {
		items.add(item);
		siftUp();
	}
	
	private void siftUp(){
		int k = items.size()-1;
		while(k>0) {
			int p =(k-1)/2;
			T item = items.get(k);
			T parent = items.get(p);
			
			//see if the parent is less than the child
			if(item.compareTo(parent)>0) {
				
				//switch the nodes around so parent > child
				items.set(k, parent);
				items.set(p,item);
				
				//move up one level
				k=p;
			}else {
				
				//sift up method ends when if already  parent > child
				break;
				
			}
		}
	
	}

	private void siftDown() {
		int k=0;
		int l = 2*k +1;
		while(l < items.size()) {
			int max =l, r=l+1;
			if(r<items.size()) {  //there is a right child
				if(items.get(r).compareTo(items.get(l))>0) {
					//switch
					T temp = items.get(k);
					items.set(k, items.get(max));
					items.set(max, temp);
					k=max;
					l= 2*k+1;
				}
			}else {
				break;
			}
		}
		
	}
	
	public T delete() throws NoSuchElementException{
		
		//throws an exception if heap is already empty
		if(items.size() ==0) {
			throw new NoSuchElementException();
		}
		
		//if only one node is there then we will get rid of it and the heap becomes null
		if(items.size()==1) {
			return items.remove(0);
		}
		T hold = items.get(0);
		
		//sets the root node to the last node of the heap
		items.set(0, items.remove(items.size()-1));
		
		//make sure the heap is under parent>child relationship
		siftDown();
		return hold;
	}
	
	public int size(){
		return items.size();
	}
	public boolean isEmpty() {
		return items.isEmpty();
	}
	public String toString(){
		return items.toString();
	}
	}
