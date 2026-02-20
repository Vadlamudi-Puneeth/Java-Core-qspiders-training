package before1daypractise;

import java.util.PriorityQueue;

public class PatientUtil {
	
	public PriorityQueue<Patient> createQueue(){
		
		return new PriorityQueue<>( (a, b) -> b.getSeverity() - a.getSeverity() );
		
	}
	
	public void addPatient(PriorityQueue<Patient> p, Patient p1) {
		p.add(p1);
	}
	
	public void processPatients(PriorityQueue<Patient>q) {
		int count = 0;
		while(!q.isEmpty()) {
			Patient p = q.poll();
			count++;
		}
		System.out.println(count);
	}
	
}	
