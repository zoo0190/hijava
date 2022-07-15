package sesac.study;

public class RobotTest {

	public static void main(String[] args) {
		RobotManager robotManager = RobotManager.getInstance();
		RobotManager robot = RobotManager.getInstance();
		Robot atom = new Atom("아톰입니당");
		Robot taekwonV = new TaekwonV("태권V 입니당");
		
		robotManager.addRobot(atom, taekwonV);
//		robotManager.go();
//		robotManager.removeRobot(1);
		
		robot.go(1);
		
//		System.out.println(robotManager.toString());
	}

}
