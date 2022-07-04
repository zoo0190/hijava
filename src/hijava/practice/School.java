package hijava.practice;

public class School {

	public static void main(String[] args) {
		Score korean = new Score();
		korean.setSubject("국어");
		korean.setScore(90);
		
		Score math = new Score("수학", 100);
		
		System.out.println(korean);
		System.out.println(math);
	}

}
