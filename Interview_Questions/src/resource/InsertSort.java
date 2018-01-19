package resource;

import java.util.Arrays;

public class InsertSort {

    public static void main(String[] args) {
	
	int[] givenArray = {4,2,9,6,5,12,34,0,1};
	
	System.out.println(Arrays.toString(givenArray));
	
	sortIt(givenArray);
	
	System.out.println(Arrays.toString(givenArray));
	
    }
    
    public static void sortIt(int[] array) {
	
	for (int i = 1; i < array.length; i++) {
	    
	    int key = array[i];	    
	    int j;
	    
	    for (j = i - 1; (j >= 0) && (array[j] > key); j--) {	
		
		array[j + 1] = array[j];
		
	    }
	    
	    array[j + 1] = key;	   
	   
	}	
	
    }

}
