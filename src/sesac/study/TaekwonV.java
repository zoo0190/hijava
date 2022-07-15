package sesac.study;

public class TaekwonV extends Robot {
	public TaekwonV(String name) {
		super(name);
	}

	@Override
	public void move() {
		System.out.println("Walk...");
	}
	
	@Override
	public void attack() {
		System.out.println("Missile!!!");
	}
	
//	public static void main(String[] args) {
//		Robot TaekwonV = new TaekwonV("TaekwonV");
//		TaekwonV.attack();
//		TaekwonV.move();
//		TaekwonV.doing();
//		System.out.println(TaekwonV.toString());
//	}
}

