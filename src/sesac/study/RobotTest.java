package sesac.study;

public class RobotTest {

	public static void main(String[] args) {
		RobotManager robotManager = new RobotManager();
		Robot atom = new Atom("아톰입니당");
		Robot taekwonV = new TaekwonV("태권V 입니당");
		
		robotManager.addRobot(atom, taekwonV);
		robotManager.go();
		robotManager.removeRobot();
		
		System.out.println(robotManager.toString());
	}

}
