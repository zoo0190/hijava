package hijava.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class StreamMain {
	public static void main(String[] args) {
//		test1();
//		test2();
		tryThis();
	}

	private static void tryThis() {
		List<Student> students = new ArrayList<>();
		students.add(new Student(90, "홍길동"));
		students.add(new Student(80, "김일수"));
		students.add(new Student(75, "김이수"));
		students.add(new Student(95, "김삼수"));
		students.add(new Student(98, "김사수"));
		students.add(new Student(87, "김오수"));
		
		// 1
		students.forEach(s -> System.out.println("1=" + s.getName()));
		
		// 2
		Student[] arr = new Student[students.size()];
		students.toArray(arr);
		
		int sum = Arrays.stream(arr).mapToInt(s -> s.getId()).sum();
		double avg = Arrays.stream(arr).mapToInt(s -> s.getId()).average().getAsDouble();
		System.out.println("sum=" + sum + ", avg=" + avg);
		
		// 3
		Arrays.stream(arr).filter(s -> s.getId() >= 90).sorted().forEach(s -> System.out.println(s));
		
	}

	private static void test2() {
		int[] arr = new int[] { 2, 3, 1, 5, 3, 2 };
		double avg =  Arrays.stream(arr).average().getAsDouble();
		System.out.println("avg=" + avg);
		
		Arrays.stream(arr).sorted().forEach(n -> System.out.println("sort=" + n));
		Arrays.stream(arr).distinct().forEach(n -> System.out.println("distinct=" + n));
		
		Arrays.stream(arr).sorted().distinct().forEach(n -> System.out.println("sortDist=" + n));
		
		Arrays.stream(arr).filter(n -> n > 2).forEach(n -> System.out.println(n));
		
		System.out.println("-----------------------");
		System.out.println(Arrays.stream(arr).reduce(0, (p, n) -> p + n));
		
	}

	private static void test1() {
		List<Student> students = new ArrayList<>();
		students.add(new Student(100, "Hong100"));
		students.add(new Student(20, "Lim20"));
		students.add(new Student(5, "Lee5"));
		
		students.stream().map(s -> s.getName()).forEach(n -> System.out.println("s=" + n));
		
		System.out.println(students.stream().mapToInt(s -> s.getId()).sum());
		
		System.out.println(students);
		System.out.println("-----------------------------");
		Collections.sort(students, new Sorting());
		System.out.println(students);
	}

}
