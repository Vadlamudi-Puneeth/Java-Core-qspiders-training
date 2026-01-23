package hasarelationshipearlyinstantiation;

public class Car1 {
	String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	private Tyres[] tyres = {
			new Tyres("CEAT"),
			new Tyres("FILLIPO"),
			new Tyres("MICHELL"),
			new Tyres("MRF")
	};
	
	public Tyres[] getTyres() {
		return tyres;
	}
	
}
