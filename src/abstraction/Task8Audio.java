package abstraction;

public class Task8Audio extends Task8MediaPlayer{
	
	@Override
	public void play() {
		System.out.println("audio playing");
	}
	
	@Override
	public void pause() {
		System.out.println("audio paused");
	}
	
	@Override
	public void getMediaDuration() {
		System.out.println("20 mins");
	}
	
}
