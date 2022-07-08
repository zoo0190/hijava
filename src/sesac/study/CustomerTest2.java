package sesac.study;

public class CustomerTest2 {

	public static void main(String[] args) {
		Customer2 cust11 = new Customer2("cust1", "YS", 30000);
		Merchandise mer = new Merchandise("mer1", "SY", 16000);
		
		cust11.buy(mer);
		
		System.out.println(cust11.getAmount());
		System.out.println(cust11.getPoint());
		System.out.println(mer.getCount());
	}

}
