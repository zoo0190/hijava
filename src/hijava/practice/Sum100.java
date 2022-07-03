package hijava.practice;

public class Sum100 {
	public static void main(String[] args) {
		sumByWhile();
		sumByFor();
	}
	
	private static void sumByFor() {
		int total = 0;
		for (int i = 1; i <= 100; i++) {
			total += i;
		}
		System.out.println("sumByFor is" + total);
	}

	private static void sumByWhile() {
		int i = 0;
		int total = 0;
		
		while(i++ < 100) {
			if (i % 2 == 0) continue;
			total += i;
		}
		System.out.println("sumByWhile is" + total);
	}
}
