package resource;

/**
 * 
 * 1) Write a program to reverse a string using recursive methods.
   You should not use any string reverse methods to do this.
 *
 * 2) Write 1 to 10 without using loop
 */
public class ReverseStringRecurse {

    public static void main(String[] args) {
	
	System.out.println(recurse("Miroslav"));
	
	System.out.println(oneToTen(1));

    }
    
    public static String recurse(String slovo) {
	
	String v = "";		
	
	if (slovo.isEmpty()) return slovo;
	
	v += slovo.charAt(slovo.length()-1) + recurse(slovo.substring(0, slovo.length()-1));
	
	return v;
	
    }
    
    public static int oneToTen(int num) {
	
	if (num == 10) {
	    return num;
	}
	System.out.print(num + " ");
	return oneToTen(++num);	
	
    }

}
