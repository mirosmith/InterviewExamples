package resource;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
	
	int[] givenArray = {5,18,14,9,58,20,3,17,50};	
	
	System.out.println(Arrays.toString(givenArray));
	
	bubble(givenArray);	
	
	System.out.println(Arrays.toString(givenArray));

    }
    
    public static void bubble(int[] array) {
	
	for (int i = 0; i < array.length; i++) {
	    
	    for (int j = 0; j < array.length - 1; j++) {
		
		if (array[j] > array[j + 1]) {
		    
		    int temp = array[j];
		    array[j] = array[j + 1];
		    array[j + 1] = temp;
		}
		
	    }
	    
	}	
	
    }

}
