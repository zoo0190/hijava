package sesac.study;

import java.util.ArrayList;

public class RobotManager {
	ArrayList<Robot> robotList = new ArrayList<Robot>();
	
	public void addRobot(Robot...args) {
		for (Robot param:args) {
			robotList.add(param);
		}
	}
	
	public void removeRobot() {
		robotList.clear();
	}
	
	public void go() {
		for (Robot param:robotList) {
			param.doing();
		}
	}

	@Override
	public String toString() {
		return robotList.toString();
	}
}
