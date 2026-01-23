package abstraction;

public class Task12Main {
	public static void main(String[] args) {
		Task12StorageService t12;
		t12 = new Task12GoogleDrive();
		t12.uploadFile("First.java");
		t12.downloadFile("Second.java");
		t12.getStorageUsage();
		t12 = new Task12DropBox();
		t12.uploadFile("First.java");
		t12.downloadFile("Second.java");
		t12.getStorageUsage();
	}
}
