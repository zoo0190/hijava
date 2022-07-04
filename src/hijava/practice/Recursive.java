package hijava.practice;

public class Recursive {

	public static void main(String[] args) {
		int num = 10;
		
		System.out.println(factorial(num));
		
		for(int i = 0; i <= num; i++) {
			System.out.print(fibo(i) + " ");
		}
	}

	private static int factorial(int num) {
		if (num <= 1) return 1;
		return num * factorial(num -1);
	}
	
	private static int fibo(int n) {
		// if (n == 0) return 0;
		// if (n == 1) return 1;
		if (n <= 1) return n;
		return fibo(n-1) + fibo(n-2);
	}
}
