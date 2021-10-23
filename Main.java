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
}

