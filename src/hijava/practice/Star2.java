package hijava.practice;

public class Star2 {

	public static void main(String[] args) {
		int line = 7;
		for(int i = 1; i <= line; i++ ) {
			for(int j = 1; j <= line; j++) {
				if (line - i >= j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
