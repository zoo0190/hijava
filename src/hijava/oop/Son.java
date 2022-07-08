package hijava.oop;

public class Son extends Mom {
	public Son() {
		super("아들");
	}
	
	public Son(String name) {
		super(name);
	}
	
	public void say() {
		System.out.println("Son said...");
	}
	
}
