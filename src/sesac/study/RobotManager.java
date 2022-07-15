package sesac.study;

import java.util.ArrayList;

public class RobotManager {
	private RobotManager() {}
	
	private static class RobotManagerHelper {
		private static final RobotManager SINGLETON = new RobotManager();
	}
	
	public static RobotManager getInstance() {
		return RobotManagerHelper.SINGLETON;
	}
	
	ArrayList<Robot> robotList = new ArrayList<Robot>();
	
	public void addRobot(Robot...args) {
		for (Robot param:args) {
			robotList.add(param);
		}
	}
	
	public void removeRobot(int idx) {
		if (!idxCheck(idx)) {
			return;
		} else {
			robotList.remove(idx);
		}
	}
	
	public void go(int idx) {
		if (!idxCheck(idx)) {
			return;
		} else {
			robotList.get(idx).doing();
		}
	}

	private Boolean idxCheck(int idx) {
		if (robotList.size() <= idx) {
			System.out.println("없는 번호는 입력하지 마세요..");
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return robotList.toString();
	}
}
