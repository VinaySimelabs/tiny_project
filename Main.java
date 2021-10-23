public class main {

	public static void main(String[] args) {
	}
}
public class Factorial {

	static void fact()
	{Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int output=1;
		int n = scanner.nextInt();
		for(int i=1;i<=n;i++)
			output=output*i;


		System.out.println("Factorial of entered number is: "+output);
	}
	
	
public class Prime {


	public void printPrime(int limit) {
		System.out.print("Prime number from 1 to 100: ");
		
		for(int j = 1; j <= limit; j++) {
			int count = 0;
		for (int i = 1; i <= limit; i++) {
			if(j%i == 0) {
				count++;
				
			}
		}
		if(count == 2) {
			
			System.out.print(" "+j);
	}

}
	}
	public class printFibonacci {

		
		static void printFibonacciNumbers(int n) {
			int f1 = 0, f2 = 1, i;

			if (n < 1)
				return;

			for (i = 1; i <= n; i++) {
				System.out.print(f2 + " ");
				int next = f1 + f2;
				f1 = f2;
				f2 = next;
			}

		}

	}
}
public class Multiple{
    private int i = 0;
    private int n = 0;

    public static void m() {

        int i = 0;
        int n = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
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
