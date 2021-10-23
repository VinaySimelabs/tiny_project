package finals;

public class Prime {
	public void printPrime(int limit) {
		System.out.print("\nPrime number from 1 to 100: ");
		
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
