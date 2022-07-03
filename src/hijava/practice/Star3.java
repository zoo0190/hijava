package hijava.practice;

public class Star3 {

	public static void main(String[] args) {
		int line = 4;
		for(int i = 1; i <= line; i++ ) {
			for(int j = 1; j <= (2 * line) - 1; j++) {
				if(line - i >= j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
				if (line + i + -1 == j) {
					break;
				}
			}
			System.out.println();
		}
	}

}
