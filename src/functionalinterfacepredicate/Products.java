package functionalinterfacepredicate;

public class Products {
	public String productId;
	public String productName;
	public double productPrice;
	
	public Products(String productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
}
