package methodchaining;

public class MarkerDriver {
	public static void main(String args[]) {
		String col = new Marker().setPrice(1000).setColor("blue").getColor();
		System.out.println(col);		
		System.out.println(new Marker().setPrice(4567).setColor("black").getPrice());
	}
}
