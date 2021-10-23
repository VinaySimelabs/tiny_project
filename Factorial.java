package finals;

import java.util.Scanner;

public class Factorial {
	void fact()
	{Scanner scanner = new Scanner(System.in);
		System.out.println("\nEnter the number:");
		int output=1;
		int n = scanner.nextInt();
		for(int i=1;i<=n;i++)
			output=output*i;


		System.out.println("Factorial of entered number is: "+output);
	}
}
