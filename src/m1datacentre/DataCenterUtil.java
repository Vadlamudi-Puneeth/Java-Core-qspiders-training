package m1datacentre;
import java.util.*;

public class DataCenterUtil {
	private Set<DataCenter> set = new LinkedHashSet<>();

	public Set<DataCenter> getSet() {
		return set;
	}

	public void setSet(Set<DataCenter> set) {
		this.set = set;
	}
	
	public DataCenterUtil() {}

	public DataCenterUtil(Set<DataCenter> set) {
		super();
		this.set = set;
	}
	
	
	public void addDataCenter(DataCenter dataCenter) {
		set.add(dataCenter);
	}
	
	public DataCenter getDataCenterById(String dataCenterId) {
		for(DataCenter d: set) {
			if(d.getDataCenterId().equals(dataCenterId)) {
				return d;
			}
		}
		return null;
	}
	
	public List<DataCenter> getDataCentersWithMaximumCoolingPowerUsage(){
		
		double max = 0;
		
		for(DataCenter d: set) {
			if(max < d.getCoolingPowerUsage()) {
				max = d.getCoolingPowerUsage();
			}
		}
		
		List<DataCenter> list = new ArrayList<>();
		
		for(DataCenter d: set) {
			if(d.getCoolingPowerUsage() == max) {
				list.add(d);
			}
		}
		
		return list;
	}
	
	
}
