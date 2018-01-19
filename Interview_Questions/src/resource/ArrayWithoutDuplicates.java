package resource;

import java.util.Arrays;

/**
 * 
 * Given array is already sorted and it has duplicate elements. Write a program to remove duplicate elements
 * and return new array without any duplicate elements. The array should contain only unique elements.
 *
 */
public class ArrayWithoutDuplicates {

    public static void main(String[] args) {
	
	int[] givenArray = {0,0,15,15,18,25,25};
	
	System.out.println(Arrays.toString(givenArray));
	
	int[] without = removeDuplicates(givenArray);
	
	System.out.println(Arrays.toString(without));	
	

    } 
  
    public static int[] removeDuplicates(int[] array) {
	
	int[] myArray = new int[array.length];
	
	if (array == null || array.length == 0) {
	    return myArray;
	}
	
	int lastPosition;
	
	if (array[0] == 0) {
	    myArray[0] = 0;
	    lastPosition = 0;
	}
	else {
	    lastPosition = -1;
	}
	
	for (int i = 0; i < array.length; i++) {
	    
	   if (isInArray(array[i], myArray)) {
	       continue;
	   }
	   else {	       
	       myArray[++lastPosition] = array[i];
	   }	   
	    
	}	
	
	int[] finalArray = Arrays.copyOf(myArray, lastPosition + 1);
	
	return finalArray;
    }
    
    public static boolean isInArray(int number, int[] array) {
	    
	for (int i = 0; i < array.length; i++) {	    
	    
	    if (array[i] == number) {		
		return true;
	    }	    
	    
	}
	
	return false;
	      
    }

}
