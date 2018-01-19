package resource;

/**
 * 
 * Write numbers in pyramid shape
 *
 */
public class PyramidShape {

    public static void main(String[] args) {
	
	// pyramid shape 1
	int number = 10;
	int count = 0;
	
	for (int i = 0; i <= number; i++) {
	    
	    for (int space = 0; space <= number - i; space++) {
		System.out.print(" ");
	    }
	    
	    for (int j = 0; j <= i; j++) {
		
		count++;
		System.out.print(count + " ");	
		
	    }  
	    
	    System.out.println();
	    
	}
	
	System.out.println();
	
	
	
	
	// pyramid shape 2
	int num = 10;
	
	for (int i = 1; i < num; i++) {
	    
	    for (int j = 1; j <= num - i; j++) {
		    
		System.out.print(" ");
		
	    } 
	    
	    for (int k = 1; k <= i; k++) {
		    
		System.out.print("" + k + " ");
		
	    }  
	    
	    for (int l = i - 1; l > 0; l--) {
		    
		System.out.print("" + l + " ");
		
	    } 
	    
	    System.out.println();
	    
	}
	

    }

}


