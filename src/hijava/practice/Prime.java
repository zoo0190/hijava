package hijava.practice;

import java.util.ArrayList;

public class Prime {

	public static void main(String[] args) {
		int primeSum = 0;
		
		for (int i = 2; i <= 100; i++) {
			if (isPrime(i)) {
				primeSum += i;
				primeList.add(i);
			}
		}
		
		System.out.println(primeSum);
	}
	
	private static ArrayList<Integer> primeList = new ArrayList<>();

	// 소수를 판별!!
	private static boolean isPrime(int i) {
		for (Integer j : primeList) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}

}
