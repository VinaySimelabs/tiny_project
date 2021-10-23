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