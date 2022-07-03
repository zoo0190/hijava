package hijava.practice;

public class Cbvr {
	int m = 2;

	public static void main(String[] args) {
		int i = 1;
		System.out.println("i=" + i);
		
		change1(i);
		System.out.println("i=" + i);
		
		Cbvr cb1 = new Cbvr();
		System.out.println("cb1=" + cb1.m);
		change2(cb1);
		System.out.println("cb1=" + cb1.m);
	}
	
	public static void change1(int x) {
		x = 100;
	}
	
	public static void change2(Cbvr cb) {
		cb.m = 100;
	}
}
