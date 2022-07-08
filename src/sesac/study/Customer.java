package sesac.study;

public class Customer {
	private String id;
	private String name;
	private int amount;
	private float rate = 2;
	private float point = 0;

	public Customer (String id, String name, int amount) {
		this.id = id;
		this.name = name;
		this.amount = amount;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAmount() {
		return this.amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public float getPoint() {
		return this.point;
	}
	
	
	
	public int buy(int price) {
		int restAmount = this.amount - price;
		if (restAmount < 0) {
			return -1;
		}
		
		this.amount = restAmount;
		this.point = this.point + price * (this.rate / 100);
		return restAmount;
	}
}
