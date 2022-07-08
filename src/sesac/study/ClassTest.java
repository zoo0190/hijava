package sesac.study;

public class ClassTest {

	public static void main(String[] args) {
		Customer cus1 = new Customer("id1", "YS", 30000);
		
		cus1.buy(10000);
		System.out.println(cus1.getAmount());
		System.out.println(cus1.buy(21000));
	}

}
