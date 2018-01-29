package resource;

import java.io.FileNotFoundException;

public class Exceptions {
    
    public static void runtime() {
	throw new RuntimeException();
    }
    
    public static void except() throws Exception {
	throw new FileNotFoundException();
    }
    
    public static void error() {
	throw new Error();
    }

    public static void main(String[] args) {
	
	try {	    	   
	    
	    error();
	    
	    // unreachable code 
	    int a = 40 / 0;
	    System.out.println(a); 
	    runtime();
	    except();  
	    
	    
	}
	catch (RuntimeException r) {
	    System.out.println("catched Runtime Exception");
	}
	catch (Exception e) {
	    System.out.println("catched Exception");
	}
	// If error() is thrown and not catched, output will be "Done" and error exception message
	catch (Error er) {
	    System.out.println("catched error");
	}
	finally {	    
	    System.out.println("Done"); 	    
	}	
	
	System.out.println("on the end");
    }
    
    

}
