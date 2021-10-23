package finals;

import java.util.Scanner;

public class Multiple {
	 int i = 0;
     int n = 0;

    public  void m() {

        int i = 0;
        int n = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter number: ");
        i = input.nextInt();
        System.out.print("Enter no of multiples: ");
        n = input.nextInt();

        if ((i <= 1) || (n <= 1)) {
            System.out.println("Please enter numbers above 1");
            System.exit(1);
        } else {
            System.out.print(n + " multiples of " + i + " are: ");
            mult(i, n);
        }

    }

    public static void mult(int i, int n) {
        int[] arr = new int[n];
        int count = 2;
        for (int x = 0; x < n; x++) {
            arr[x] = i * count++;
        }
        for (int y = 0; y < arr.length; y++) {
            System.out.print(arr[y] + " ");
        }
    }
}

