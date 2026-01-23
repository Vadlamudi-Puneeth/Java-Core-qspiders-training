package hasarelationlazyinstantiation;

public class Tyre {
	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	Tyre(String brand){
		this.brand = brand;
	}
}
