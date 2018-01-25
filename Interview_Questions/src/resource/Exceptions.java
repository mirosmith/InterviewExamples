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
	    System.out.println("something"); 
	    runtime();
	    except();	    
	    
	    
	}
	catch (RuntimeException r) {
	    System.out.println("catched Runtime Exception");
	}
	catch (Exception e) {
	    System.out.println("catched Exception");
	}
	catch (Error er) {
	    System.out.println("catched error");
	}	
	
	
	System.out.println("on the end");
    }
    
    

}
