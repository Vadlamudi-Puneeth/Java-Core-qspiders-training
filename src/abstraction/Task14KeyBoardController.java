package abstraction;

public class Task14KeyBoardController implements Task14Controller{
	
	@Override
	public void move() {
		System.out.println("moved");
	}
	
	@Override
	public void attack() {
		System.out.println("attacked");
	}
	
	@Override
	public void pauseGame() {
		System.out.println(true);
	}
	
}
