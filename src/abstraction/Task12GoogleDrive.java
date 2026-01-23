package abstraction;

public class Task12GoogleDrive implements Task12StorageService{

	@Override
	public void uploadFile(String name) {
		System.out.println(name + " this named file uploaded");
	}
	
	@Override
	public void downloadFile(String name) {
		System.out.println(name + " this named file downloaded");
	}
	
	@Override
	public void getStorageUsage() {
		System.out.println("1MB used");
	}

}
