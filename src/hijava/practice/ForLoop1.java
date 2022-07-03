package hijava.practice;

public class ForLoop1 {

	public static void main(String[] args) {
		multiplicationTable();
	}
	
	private static void multiplicationTable() {
		System.out.println("짝수 구구단");
		
		for (int i = 2; i <= 9; i++) {
			if (i % 2 == 1) continue;
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println("-------------------------");
		}
	}

}
