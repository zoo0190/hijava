package hijava.oop;

public class Mom {
	private String name;
	
	public Mom(String name) {
		this.name = name;
	}
	
	public Mom() {
		this("엄마");
	}
	
	public String getName() {
		return this.name;
	}
	
	protected void eat() {
		System.out.println("EAT!!!!");
	}
	
	public void say() {
		System.out.println("Mom said ...");
	}
}
