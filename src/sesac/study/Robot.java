package sesac.study;

public class Robot {
	private String name;
	
	public Robot(String name) {
		this.name = name;
	}
	
	public void move() {
		System.out.println("Robot move");
	}
	
	public void attack() {
		System.out.println("Robot Attack");
	}
	
	public void doing() {
		move();
		attack();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "My name is " + name + ".";
	}
	
//	public static void main(String[] args) {
//		Robot robot = new Robot("Robot");
//		robot.attack();
//		robot.move();
//		robot.doing();
//		System.out.println(robot.toString());
//	}
}
