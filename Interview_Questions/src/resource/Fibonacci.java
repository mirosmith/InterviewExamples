package resource;

/**
 * Write a program to print fibonacci series.
 * 
 * In mathematics, the Fibonacci numbers or Fibonacci series or Fibonacci sequence are the numbers 
 * in the following integer sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... 
 * By definition, the first two numbers in the Fibonacci sequence are 0 and 1, 
 * and each subsequent number is the sum of the previous two. 
 * Below example shows how to create fibonacci series.
 *
 */
public class Fibonacci {

    public static void main(String[] args) {
	
	int n = 42;
	
	Long start,end,time;
	
	start = System.currentTimeMillis();
	
	for (int i = 0; i < n; i++) {
	    System.out.print(recursive(i) + " ");	    
	}
	
	end = System.currentTimeMillis();
	time = end - start;
	System.out.print("time: " + time  + "\n");	
	
	
	for (int i = 0; i < n; i++) {
	    System.out.print(nonRecursive(i) + " ");	    
	}	
	
	System.out.println();
	
	int[] fibArray = nonRecursiveArray(n);
	
	for (int i = 0; i < fibArray.length; i++) {
	    System.out.print(fibArray[i] + " ");	    
	}
	
    }
    
    public static int recursive(int n) {
	
	if (n == 0) return 0;
	
	if (n == 1) return 1;
	
	return recursive(n - 2) + recursive(n - 1);
	
    }
    
    public static int nonRecursive(int n) {
	
	int result = 0;

	if (n == 0) {
	    return 0;
	}
	else if (n == 1) {
	    return 1;
	}
	else if (n > 1){
	    
	    int previous = 1;
	    int prePrevious = 0;	     
	    
	    for (int i = 2; i <= n; i++) {
		
		result = prePrevious + previous;
		prePrevious = previous;
		previous = result;		
		
	    }		    
	    
	}
	
	return result;	
	
    }
    
    public static int[] nonRecursiveArray(int n) {
	
	int[] array = new int[n];
	
	array[0] = 0;
	array[1] = 1;
	
	for (int i = 2; i < array.length; i++) {
	    
	    array[i] = array[i - 1] + array[i - 2];
	    
	}
	
	return array;
	
    }

}
