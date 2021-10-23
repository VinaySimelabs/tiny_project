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

	      /*
	       * Printing the pattern first j for loop inputs initial spaces according to the
	       * number while second j for loop inputs the numbers and inputs one space after
	       * each number
	       */
	      for (int i = 1; i <= rows; i++) {
	        for (int j = 1; j < i; j++) {
	          System.out.print(" ");
	        }
	        for (int j = i; j <= rows; j++) {
	          System.out.print(j + " ");
	        }
	        System.out.println();
	      }

	      // reverse printing code
	      /*
	       * same as above code only the first for loop is made reverse ie i will
	       * initially have the number and keeps decrementing
	       */
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

