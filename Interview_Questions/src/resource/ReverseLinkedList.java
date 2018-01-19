package resource;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {

    public static void main(String[] args) {
	
	List<Integer> list = new LinkedList<>();
	
	list.add(1);
	list.add(5);
	list.add(20);
	list.add(50);
	
	print(list);
	
	Collections.reverse(list);
	
	print(list);
	
	//reverseOrder(list);
	
	
    }
    
    public static void print(List<Integer> list) {
	
	for (Integer i : list) {
	    
	    System.out.println(i);	    
	    
	}
	System.out.println();
    }
    
    public static void reverseOrder(List<Integer> list) {
	
	for (int i = list.size()-1; i >= 0; i--) {
	    
	    System.out.println(list.get(i));	    
	    
	}
	System.out.println();
	
    }   
    

}
