package sesac.study;

public class Atom extends Robot {

	public Atom(String name) {
		super(name);
	}

	@Override
	public void move() {
		System.out.println("Fly~~!!");
	}
	
	@Override
	public void attack() {
		System.out.println("Punch!!!");
	}
	
//	public static void main(String[] args) {
//		Robot atom = new Atom("Atom");
//		atom.attack();
//		atom.move();
//		atom.doing();
//		System.out.println(atom.toString());
//	}
}
