package resource;

/**
 * 
 * Write a program to check the given number is a prime number or not.
 *
 */
public class PrimeNumber {

    public static void main(String[] args) {

	int number = 12;

	if (primeOrNot(number)) {
	    System.out.println(number + " is prime number");
	} else {
	    System.out.println(number + " is not prime number");
	}

	// printPrimeNumbers(number);

	System.out.println("sum of 1000 prime numbers is: " + sumOf1000PrimeNumbers());

    }

    public static boolean primeOrNot(int number) {

	for (int i = 2; i <= number/2; i++) {

	    if (number % i == 0) {
		return false;
	    }

	}

	return true;
    }

    public static void printPrimeNumbers(int number) {

	boolean[] array = new boolean[number + 1];

	for (int i = 2; i < array.length; i++) {
	    for (int j = 0; j < array.length; j = j + i) {

		if (i == j) {
		    continue;
		}

		array[j] = true;
	    }

	}

	for (int i = 0; i < array.length; i++) {
	    if (array[i] == false) {
		System.out.print(i + " ");
	    }
	}

    }

    public static int sumOf1000PrimeNumbers() {

	int limit = 1000;
	int sum = 0;	

	for (int i = 2; limit != 0; i++) {
	    
	    if (primeOrNot(i)) {
		limit--;    	    	
    	    	sum += i; 
	    }
	    
	}	 

	return sum;
    }

}
