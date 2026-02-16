package m1datacentre;

public class DataCenter {
	String dataCenterId;
	String location;
	String superVisorName;
	double coolingPowerUsage;
	
	public DataCenter() {}
		
	public DataCenter(String dataCenterId, String location, String superVisorName, double coolingPowerUsage) {
		super();
		this.dataCenterId = dataCenterId;
		this.location = location;
		this.superVisorName = superVisorName;
		this.coolingPowerUsage = coolingPowerUsage;
	}
	
	public String getDataCenterId() {
		return dataCenterId;
	}
	
	public void setDataCenterId(String dataCenterId) {
		this.dataCenterId = dataCenterId;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getSuperVisorName() {
		return superVisorName;
	}
	
	public void setSuperVisorName(String superVisorName) {
		this.superVisorName = superVisorName;
	}
	
	public double getCoolingPowerUsage() {
		return coolingPowerUsage;
	}
	
	public void setCoolingPowerUsage(double coolingPowerUsage) {
		this.coolingPowerUsage = coolingPowerUsage;
	}

}	
