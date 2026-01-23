package encapsulation;

public class Task9 {
	private String password = "1234567654";
	public void setPassword(String password) {
		if(password.length() >= 8 || !password.equals(null)) {
			this.password = password;
		}
	}
	public String getPassword() {
		return password;
	}
}
