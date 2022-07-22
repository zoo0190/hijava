package hijava.basic;

public class Outter {
	private int id;
	private String name;
	
	public int getId() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void callIn() {
		Inner inner = new Inner();
		inner.in();
	}
	
	// 밖에서 쓰지말고 outter 클래스를 통해서 실행해라...!
	class Inner {
		public void in() {
			System.out.println("in inner class >> name=" + name);
		}
	}
	
	static class StaticInner {
		static String inStr = "Static Inner inStr";
		public static void in() {
			System.out.println("static inner class >> name=" + inStr);
		}
	}
	
	public static void main(String[] args) {
		Outter o = new Outter();
		o.setName("Hong");
		System.out.println("o.name=" + o.getName());
		o.callIn();
		
//		Inner inner = new Inner(); // fail !!(: outer가 먼저 생성되야 함!!)
		StaticInner.in();
	}
	
}
