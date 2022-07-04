package hijava.practice;

public class Prime {

	public static void main(String[] args) {
		int primeSum = 0;
		for (int i = 2; i <= 100; i++) {
			if (isPrime(i)) primeSum += i;
			else System.out.println(i + " is Not Prime Number!!");
		}
		
		System.out.println(primeSum);
	}

	// 소수를 판별!!
	private static boolean isPrime(int i) {
		for (int j = 2; j < i; j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}

}
