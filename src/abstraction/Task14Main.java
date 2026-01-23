package abstraction;

public class Task14Main {
	public static void main(String[] args) {
		Task14Controller t14;
		t14 = new Task14KeyBoardController();
		t14.move();
		t14.attack();
		t14.pauseGame();
		t14 = new Task14GamePadController();
		t14.move();
		t14.attack();
		t14.pauseGame();
	}
}
