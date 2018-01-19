package resource;


/**
 * 
 * You are given an array of numbers. Find out the array index or position
   where sum of numbers preceeding the index is equals to sum of numbers
   succeeding the index.
 *
 */
public class MiddleIndexEquals {

    public static void main(String[] args) {
	
	int[] array = new int[] {2, 4, 4};
	
	int index = 0;
	boolean found = false;
	
	for (int i = 1; i < array.length; i++) {
	    
	    int sumL = 0;
	    int sumR = 0;
	    
	    for (int j = 0; j <= i; j++) {
		
		sumL += array[j]; 
		
	    }
	    
	    for (int k = i + 1; k < array.length; k++) {
		
		sumR += array[k]; 
		
	    }
	    
	    if (sumL == sumR) {
		index = i;
		found = true;
		break;
	    }
	    
	    
	}
	
	if (found) {
	    System.out.println("index = " + index);
	}
	else {
	    System.out.println("not found");
	}
	
	
    }

}
