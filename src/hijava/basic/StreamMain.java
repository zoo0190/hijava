package hijava.basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamMain {
	public static void main(String[] args) throws IOException {
//		test1();
//		test2();
//		tryThis();
//		test3();
//		test4();
//		test5();
		test6();
	}
	
	// 좋은 코드!!
	private static void test6() {
		try(FileInputStream fis = new FileInputStream("test.txt")) {
			System.out.println("hihihihihihi");
		} catch (FileNotFoundException e) {
			System.out.println("test.txt파일이 없어요!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void test5() throws IOException {
		FileInputStream fis = new FileInputStream("test.txt");
		fis.close();
	}

	// 개선된 버전
	private static void test4() {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("test.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("text.txt파일이 없어요!!" + e.getMessage());
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void test3() {
		try {
			FileInputStream fis = new FileInputStream("test.txt");
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("text.txt파일이 없어요!!" + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
		}
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
