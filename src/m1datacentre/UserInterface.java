package m1datacentre;
import java.util.*;

public class UserInterface {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 3;
		sc.nextLine();
		
		DataCenterUtil util = new DataCenterUtil();
		
		for(int i = 0; i < n; i++) {
			String str = sc.nextLine();
			String input[] = str.split(":");
			Double input4 = Double.parseDouble(input[3]);
			util.addDataCenter(new DataCenter(input[0], input[1], input[2], input4));
			
		}
		
		System.out.println("Enter the Data Center ID to get details");
		String id = sc.nextLine();
		
		DataCenter d1 = util.getDataCenterById(id);
		if(d1 != null)
			System.out.println(d1.getDataCenterId() + "|" + d1.getLocation() + "|" + d1.getSuperVisorName() + "|"  + d1.getCoolingPowerUsage());
		
		
		System.out.println("Data Centers with maximum cooling power usage");
		List<DataCenter> list = util.getDataCentersWithMaximumCoolingPowerUsage();
		
		for(DataCenter d: list) {
			System.out.println(d.getDataCenterId() + "|" + d.getLocation() + "|" + d.getSuperVisorName()  + "|" + d.getCoolingPowerUsage());
		}
		
	}
}
