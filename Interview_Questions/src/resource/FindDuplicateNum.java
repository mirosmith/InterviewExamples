package resource;

import java.util.Scanner;

/**
 * 
 * You have got a range of numbers between 1 to N, where one of the number is
   repeated. You need to write a program to find out the duplicate number.
 *
 */

public class FindDuplicateNum {

    public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter N: ");
	int n = sc.nextInt();
	
	int[] pole = new int[n];
	int o = 0;
	
	while (o != n) {
	    
	    System.out.print("enter number[" + o + "]= ");
	    pole[o] = sc.nextInt();
	    o++;
	}
	
	sc.close();
	
	int duplicate = 0;
	boolean found = false;
	
	for (int i = 0; i < pole.length; i++) {	    
	   	    
	    for (int j = i; j < pole.length; j++) {
		
		if ((pole[j] == pole[i]) && (i != j)) {		    
		   
		    duplicate = pole[j];
		    found = true;
		    
		}
		
	    }
	    
	}
	
	if (found) {
	    System.out.println("duplicate number = " + duplicate);
	}
	else {
	    System.out.println("no duplicate number");
	}
	

    }

}
