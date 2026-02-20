package before1daypractise;

public class Patient {
	
	int id;
	String name;
	String disease;
	int severity;
	public Patient(int id, String name, String disease, int severity) {
		super();
		this.id = id;
		this.name = name;
		this.disease = disease;
		this.severity = severity;
	}
	
	
	
	public Patient() {}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDisease() {
		return disease;
	}



	public void setDisease(String disease) {
		this.disease = disease;
	}



	public int getSeverity() {
		return severity;
	}



	public void setSeverity(int severity) {
		this.severity = severity;
	}



	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", disease=" + disease + ", severity=" + severity + "]";
	}
	
	
	
	
	
}
