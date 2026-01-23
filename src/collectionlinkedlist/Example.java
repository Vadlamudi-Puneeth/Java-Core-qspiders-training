package collectionlinkedlist;
import java.util.*;

	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}

public class Example {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Node head = null;
		Node temp = null;
		
		for(int i = 0;i < n; i++) {
			Node newNode = new Node(sc.nextInt());
			
			if(head == null) {
				head = temp = newNode;
			}else {
				temp.next = newNode;
				temp = newNode;
			}	
		}
		
		Node top = head;
		
		while(top != null) {
			System.out.println(top.data);
			top = top.next;
		}
		
	}
}
