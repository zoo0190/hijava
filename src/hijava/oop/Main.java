package hijava.oop;

import java.util.ArrayList;

import hijava.practice.Man;

public class Main {

	public static void main(String[] args) {
//		al();
		Mom mom = new Mom();
		Son son = new Son();
		
		mom.eat();
		son.eat();
		
		mom.say();
		son.say();
	}

	private static void al() {
		ArrayList<Man> people = new ArrayList<>();
		
		for (int i = 0; i < 9; i++) {
			Man m = new Man("김" + (i + 1) + "수");
			m.buyCoffee(1);
			
			people.add(m);
			
		}
		
		int size = people.size();
		for (int i = 0; i < size; i++) {
			System.out.println(people.get(i));
		}
	}

}
