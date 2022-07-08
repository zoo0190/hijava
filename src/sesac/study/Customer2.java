package sesac.study;

public class Customer2 extends Customer {
	public Customer2(String id, String name, int amount) {
		super(id, name, amount);
	}
	
	public int buy(Merchandise m) {
		int restAmount = this.getAmount() - m.getPrice();
		if (restAmount < 0) {
			return -1;
		}
		
		this.setAmount(restAmount);
		this.setPoint(this.getPoint() + m.getPrice() * (this.getRate() / 100));
		m.sell();
		return restAmount;
	}
}
