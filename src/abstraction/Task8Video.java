package abstraction;

public class Task8Video extends Task8MediaPlayer{
	@Override
	public void play() {
		System.out.println("video playing");
	}
	
	@Override
	public void pause() {
		System.out.println("video paused");
	}
	
	@Override
	public void getMediaDuration() {
		System.out.println("10 mins");
	}
}
