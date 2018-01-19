package resource;

/**
 * 
 * Find out sum of each digit in the given number using recursion logic. For example if the number is 259, then sum should be 2+5+9 = 16
 *
 */
public class SumDigitRecursion {

    public static void main(String[] args) {	

	int a = sumOfDigitsR(70);
	
	System.out.println(a);
	
    }
    
    public static int sumOfDigitsR(int number) {	
	
	if (number == 0) {
	    return number % 10;
	}	
	
	return (number % 10) + sumOfDigitsR(number/10);
    }

}
