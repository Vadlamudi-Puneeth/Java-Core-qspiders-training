package abstraction;

public interface Task12StorageService {
	abstract void uploadFile(String name);
	abstract void downloadFile(String name);
	void getStorageUsage();
}
