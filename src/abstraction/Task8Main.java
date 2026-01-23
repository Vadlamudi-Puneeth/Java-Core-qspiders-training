package abstraction;

public class Task8Main {
	public static void main(String[] args) {
		Task8MediaPlayer t8;
		t8 = new Task8Audio();
		t8.play();
		t8.pause();
		t8.getMediaDuration();
		t8 = new Task8Video();
		t8.play();
		t8.pause();
		t8.getMediaDuration();
	}
}
