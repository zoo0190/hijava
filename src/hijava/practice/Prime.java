package hijava.practice;

public class Prime {

	public static void main(String[] args) {
		int primeSum = 0;
		for (int i = 2; i <= 100; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			
			if (isPrime) primeSum += i;
		}
		
		System.out.println(primeSum);
	}

}
