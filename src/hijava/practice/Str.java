package hijava.practice;

public class Str {
	public static void main(String[] args) {
		charTest();
		substrTest();
	}

	private static void substrTest() {
		String s = "abc-def";
		String s1 = s.substring(4);
		String s2 = s.substring(2, 5);
		
		System.out.println("s1=" + s1);
		System.out.println("s2=" + s2);
	}

	private static void charTest() {
		char c = 'A'; // cf. char c = 65;    or  char c = '\uD55C';
		byte b = 'A';
		System.out.println(c);
		System.out.println((int)c); // cf. (char)c  or   (char)b
		System.out.println(b);

		String str = "AB";
		System.out.println(str);
		System.out.println("AB".getBytes().length);
		System.out.println("AB한".getBytes().length);
	}
}
