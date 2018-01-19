package resource;

/**
 * 
 * Write a program to find top two maximum numbers in the given array. You
 * should not use any sorting functions. You should iterate the array only once.
 * You should not use any kind of collections in java.
 *
 */
public class TwoMaxNumbers {

    public static void main(String[] args) {

	int[] array = { 19, 12, 1, 10 , 40, 8, 6};

	int max = 0;
	int secondMax = 0;

	if (array.length >= 2) {
	    for (int i = 0; i < array.length; i++) {

		if (array[i] > max) {
		    secondMax = max;
		    max = array[i];
		} 
		else if (array[i] > secondMax) {
		    secondMax = array[i];
		}

	    }
	    
	    System.out.println("Max number is: " + max);
	    System.out.println("Second max number is: " + secondMax);
	} 
	else {
	    System.out.println("array is too small");
	}
	
    }

}
