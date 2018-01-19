package resource;

import java.util.Scanner;

/**
 * 
 * A perfect number is a positive integer that is equal to the sum
of its proper positive divisors, that is, the sum of its positive
divisors excluding the number itself. Equivalently, a perfect number
is a number that is half the sum of all of its positive divisors.
The first perfect number is 6, because 1, 2 and 3 are its proper
positive divisors, and 1 + 2 + 3 = 6. Equivalently, the number 6
is equal to half the sum of all its positive divisors:
		( 1 + 2 + 3 + 6 ) / 2 = 6.
 *
 */
public class PerfectNumber {

    public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter number: ");
	int number = sc.nextInt();
	System.out.println();
	
	sc.close();	
	System.out.println("Perfect numbers:");
	
	Long start = System.currentTimeMillis();
	for (int i = 0; i <= number; i++) {
	    
	    if (isPerfectNumber(i)) {
		System.out.print(i + " ");
	    }	    
	    
	}		
	Long result = (System.currentTimeMillis() - start);
	
	System.out.println();
	
	System.out.println("processed time: " + result.floatValue()/1000 + " seconds");
    }
    
    public static boolean isPerfectNumber(int number) {
	
	if (number == 0) {
	    return false;
	}
	
	int sumOfDivisors = 0;	
	
	for (int i = 1; i <= number/2; i++) {	    
	    
	    if ((number % i) == 0) {
		sumOfDivisors += i;
	    }
	    
	}	
	
	if (sumOfDivisors == number) {
	    return true;
	}
	else {
	    return false;
	}
	
    }    
    

}
