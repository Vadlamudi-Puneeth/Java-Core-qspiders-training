package arrays;

public class Task30 {
	public static void main(String args[]) {
		int rooms[] = {1,2,3,4,5};
		
		rooms[2] = 0;
		rooms[4] = 0;
		int rooms1[] = new int[rooms.length];
		
		int index = 0;
		for(int i = 0;i < rooms.length; i++) {
			if(rooms[i] != 0) {
				rooms1[index++] = rooms[i];
			}
		}
		
		for(int i: rooms1) {
			System.out.print(i + " ");
		}
		
	}
}
