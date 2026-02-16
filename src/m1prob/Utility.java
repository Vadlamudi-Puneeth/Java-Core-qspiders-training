package m1prob;

public class Utility {
	
	public GoodsTransport parseDetails(String input){
		String arr[] = input.split(":");
		
		if(arr[3].equals("BrickTransport")) {
			int transportRating = Integer.parseInt(arr[2]);
			float brickSize = Float.parseFloat(arr[4]);
			int brickQuantity = Integer.parseInt(arr[5]);
			float brickPrice = Float.parseFloat(arr[6]);
			
			return new BrickTransport(arr[0],arr[1] ,transportRating,brickSize, brickQuantity, brickPrice);
			
		}else if(arr[3].equals("TimberTransport")){
			int transportRating = Integer.parseInt(arr[2]);
			float timberLength = Float.parseFloat(arr[4]);
			float timberRadius = Float.parseFloat(arr[5]);
            String timberType = arr[6];
            float timberPrice = Float.parseFloat(arr[7]);
			return new TimberTransport(arr[0], arr[1], transportRating, timberLength, timberRadius, timberType, timberPrice);
		}
		return null;
		
	}
	
	public boolean validateTransportId(String transportId) {
		if(transportId.matches("RTS[0-9]{3}[A-Z]")) {
			return true;
		}
		return false;
	}
	
	public String findObjectiveType(GoodsTransport goodsTransport) {
		if(goodsTransport instanceof BrickTransport) {
			return "BrickTransport";
		}else if(goodsTransport instanceof TimberTransport) {
			return "TimberTransport";
		}
		return null;
	}
	
	
	
}
