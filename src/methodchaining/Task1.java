package methodchaining;

public class Task1 {
	private String product_name;
	private int price;
	private int discount;
	private int quantity;
	public String getProduct_name() {
		return product_name;
	}
	public Task1 setProduct_name(String product_name) {
		this.product_name = product_name;
		return this;
	}
	public int getPrice() {
		return price;
	}
	public Task1 setPrice(int price) {
		this.price = price;
		return this;
	}
	public int getDiscount() {
		return discount;
	}
	public Task1 setDiscount(int discount) {
		this.discount = discount;
		return this;
	}
	public int getQuantity() {
		return quantity;
	}
	public Task1 setQuantity(int quantity) {
		this.quantity = quantity;
		return this;
	}
	
	
	
}
