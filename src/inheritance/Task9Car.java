package inheritance;

public class Task9Car extends Task9FourWheeler{
		String brand;
		String model;
		
		Task9Car(String brand, String model, String type){
			super(type);
			this.brand = brand;
			this.model = model;
		}
		
		public void display() {
			super.displayVehicle();
			System.out.println(brand);
			System.out.println(model);
		}
}
