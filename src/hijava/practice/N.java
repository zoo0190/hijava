package hijava.practice;

public class N {
	int x = 10;
	int y = 20;
	
	public void swap() {
		int temp = 0;
		temp = x;
		x = y;
		y = temp;
		
//		int t = x;
//		x = y;
//		y = t;
	}
	
	public static void main(String[] args) {
		N n = new N();
		System.out.println("x=" + n.x);
		System.out.println("y=" + n.y);
		n.swap();
		System.out.println("---------------------");
		System.out.println("x=" + n.x);
		System.out.println("y=" + n.y);
	}

}
