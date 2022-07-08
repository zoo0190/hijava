package hijava.practice;

import hijava.oop.Mom;
import hijava.oop.Son;

public class Arr {

	public static void main(String[] args) {
//		ex1();
//		ex2();
//		ex3();
//		ex4();
//		ex5();
//		ex6();
		
		Mom mom = new Mom("영자");
		mom.say();
		
		Mom son = new Son("길동");
		son.say();
		
		System.out.println(son.getName());
	}

	private static void ex6() {
		int upperStart = 65;
		int lowerStart = 97;
		
		int[][] arr = new int[2][26];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (i == 0 ? upperStart + j : lowerStart + j);
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print((char)arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void ex5() {
		int[] arr1 = {10, 20, 30, 40, 50};
		int[] arr2 = { 1, 2, 3, 4, 5 };
		System.arraycopy(arr1, 0, arr2, 2, 3);
		
		for (int i : arr2) {
			System.out.println(i);
		}
	}

	private static void ex4() {
		Man[] people = new Man[9];
		int len = people.length;
		for (int i = 0; i < len; i++) {
			people[i] = new Man("김" + (i+1) + "수");
		}
		
		Man[] people2 = new Man[len];
		for (int i = 0; i < len; i++) {
//			people2[i] = people[i]; // shallow copy
			people2[i] = new Man(people[i].getName()); // deep copy (clone)
		}
		
		people[0].setName("김111111111");
		
		System.out.println("1=" + people[0].getName());
		System.out.println("2=" + people2[0].getName());
//		for (Man man : people2) {
//			System.out.println(man);
//		}
	}

	private static void ex3() {
		Man[] people = new Man[9];
		int len = people.length;
		for (int i = 0; i < len; i++) {
			people[i] = new Man("김" + (i+1) + "수");
		}
		
		for (Man man : people) {
			System.out.println(man);
		}
	}

	private static void ex1() {
		int[] nums = new int[100];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}
		
		printArray(nums);
	}
	
	private static void ex2() {
		String[] strs = new String[100];
		
		for (int i = 0; i < strs.length; i++) {
			strs[i] = "str" + (i + 1);
		}
		
		printArray(strs);
	}
	
	private static void printArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

	private static void printArray(String[] strs) {
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}
}
