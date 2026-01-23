package exceptionhandling;

public class Task8Orders {
	static String Allcoupons[] = {"1JNFV3K","13ON49DSS","23NJJIS9","23N4JFSDI"};
	static String AllAddress[] = {"kavali","nellore","gudur","vijayawada"};
	static boolean timeOut = false;
	
	public static void main(String[] args) {
		try{
			placeOrder("1JNFV3K", "kavali");
		}catch(Task8AddressNotFound a) {
			System.out.println(a.getMessage());
		}catch(Task8InvalidCoupon ic) {
			System.out.println(ic.getMessage());
		}catch(Task8PaymentGateWayTimeOut p) {
			System.out.println(p.getMessage());
		}
	}
	
	public static void placeOrder(String coupon, String address)  throws Task8AddressNotFound, Task8InvalidCoupon, Task8PaymentGateWayTimeOut{
		boolean isCouponExist = false;
		for(String i: Allcoupons) {
			if(i.equals(coupon)) {
				isCouponExist = true;
			}
		}
		boolean isAddressExist = false;
		for(String i: AllAddress) {
			if(i.equals(address)) {
				isAddressExist = true;
			}
		}
		
		if(isCouponExist && isAddressExist && !timeOut){
			System.out.println("order successfully places");
		}else if(!isAddressExist) {
			throw new Task8AddressNotFound("address not found");
		}else if(!isCouponExist) {
			throw new Task8InvalidCoupon("coupon not exist");
		}else if(timeOut) {
			throw new Task8PaymentGateWayTimeOut("time out");
		}
		
	}
}
