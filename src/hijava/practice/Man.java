package hijava.practice;

public class Man {
	public static final int COFFEE = 3000;
	public static final int DONUT = 2500;
	
	private String name;
	private int amount;
	
	@Override
	public String toString() {
		return name + "님의 잔액은 " + amount + "원 입니다.";
	}

	public Man() {
		this.amount = 10000;
	}
	
	public Man(String name) {
		this();
		this.name = name;
	}
	
	public void sayHello() {
		System.out.println("안녕하세요.");
		System.out.println("제 이름은 " + this.getName() + "입니다.");
	}
	
	public void buyCoffee(int count) {
		this.subAmount(COFFEE, count);
	}
	
	public void buyDonut(int count) {
		this.subAmount(DONUT, count);
	}
	
	private void subAmount(int price, int count) {
		this.amount -= price * count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public static void main(String[] args) {
//		Man hong = new Man("Hong");
//		Man john = new Man("John");
//		
//		hong.buyCoffee(1);
//		hong.buyDonut(2);
//		
//		john.buyCoffee(2);
//		john.buyDonut(1);
//		
//		System.out.println("hong = " + hong.getAmount());
//		System.out.println("john = " + john.getAmount());
		
		Man hong = new Man("Hong");
		Man kim = new Man("Kim");
		Man kildong = hong;
			
		System.out.println(hong.hashCode());
		System.out.println(kim.hashCode());
		System.out.println(kildong.hashCode());
		System.out.println( System.identityHashCode(kildong) );
	}
}
