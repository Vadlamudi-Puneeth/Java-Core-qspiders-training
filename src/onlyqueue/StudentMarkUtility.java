package onlyqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class StudentMarkUtility {
	public StudentMarks findTopStudent(PriorityQueue<StudentMarks> pq) {
		PriorityQueue<StudentMarks> pq1 = new PriorityQueue<>((a, b)->b.getMarks()- a.getMarks());
		pq1.addAll(pq);
		return pq1.peek();
		
	}
	
	public List<StudentMarks> getTopNStudents(PriorityQueue<StudentMarks> pq, int n){
		List<StudentMarks> list = new ArrayList<>();
		int count = 0;
		
		while(!pq.isEmpty() && count < n) {
			list.add(pq.poll());
			count++;
		}
		
		return list;
		
	}

}
