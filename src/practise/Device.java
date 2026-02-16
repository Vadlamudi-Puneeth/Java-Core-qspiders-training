package practise;
import java.util.*;

public class Device {
	String deviceId;
	String deviceName;
	int maxAllocations;
	List<String> allocatedEmployees = new ArrayList<>();
	
	
	
	public Device(String deviceId, String deviceName, int maxAllocations) {
		this.deviceId = deviceId;
		this.deviceName = deviceName;
		this.maxAllocations = maxAllocations;
	}
	
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public int getMaxAllocations() {
		return maxAllocations;
	}
	public void setMaxAllocations(int maxAllocations) {
		this.maxAllocations = maxAllocations;
	}
	public List<String> getAllocatedEmployees() {
		return allocatedEmployees;
	}
	public void setAllocatedEmployees(List<String> allocatedEmployees) {
		this.allocatedEmployees = allocatedEmployees;
	}
	
	public void allocateToEmployee(String employeeName) throws DuplicateAllocationException, DeviceLimitExceededException{
		if(allocatedEmployees.contains(employeeName))  {
			throw new DuplicateAllocationException("Cannot allocate: Employee already assigned this device.");
		}
		
		if(allocatedEmployees.size() >= getMaxAllocations()) {
			throw new DeviceLimitExceededException("Cannot allocate: Device allocation limit reached.");
		}
		
		allocatedEmployees.add(employeeName);
		
	}
	
}
