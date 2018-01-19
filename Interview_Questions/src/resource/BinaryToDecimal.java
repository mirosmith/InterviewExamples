package resource;

public class BinaryToDecimal {

    public static void main(String[] args) {
	
	int binary = 101;
	int digit = 0;
	int sum = 0;
	int power = 0;
	
	// FROM BINARY TO DECIMAL
	
	// Option 1
	while (binary != 0 ) {
	    
	    digit = binary % 10;
	    sum += digit * Math.pow(2, power);
	    binary = binary / 10;
	    power++;
	}
	
	System.out.println("decimal is: " + sum);
	
	
	// Option 2	
	String binaryNum = "101";
	int decimal = Integer.parseInt(binaryNum, 2);
	System.out.println("decimal = " + decimal);
	
	
	
	// FROM DECIMAL TO BINARY
	
	int decimalNum = 6;
	
	String binaryS = Integer.toBinaryString(decimalNum);
	System.out.println("binary:" + binaryS);
	
	
	
	 
    }

}
