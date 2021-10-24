package finals;

import java.util.Scanner;

public class Pattern1 {
	public void patterns() {
	    /*code by vinay vincent*/
	    String result;

	    Scanner re = new Scanner(System.in);
	    do {

	      Scanner s = new Scanner(System.in);
	      System.out.println("\nEnter the number");// Number of rows
	      int rows = s.nextInt();

	    
	      for (int i = 1; i <= rows; i++) {
	        for (int j = 1; j < i; j++) {
	          System.out.print(" ");
	        }
	        for (int j = i; j <= rows; j++) {
	          System.out.print(j + " ");
	        }
	        System.out.println();
	      }

	     
	      for (int i = rows - 1; i >= 1; i--) {
	        for (int j = 1; j < i; j++) {
	          System.out.print(" ");
	        }
	        for (int j = i; j <= rows; j++) {
	          System.out.print(j + " ");
	        }
	        System.out.println();
	      }
	      System.out.println("wish to continue(y/n)");
	      result = re.next();

	    } while (result.equals("y"));

	    System.out.println("Bye");
	  }

	}

