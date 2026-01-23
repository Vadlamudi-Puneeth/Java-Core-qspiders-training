package encapsulation;

public class Task4 {
	private int volume;
	
	public void setVolume(int volume) {
		if(volume > 0 && volume < 100) {
			this.volume = volume;
		}
	}
	
	public int getVolume() {
		return volume;
	}
	
}
