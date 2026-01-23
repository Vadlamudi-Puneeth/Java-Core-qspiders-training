
package week3;

public class Task10Department {
	
	 private String deptName;
	    private Task10Course[] courses;   // HAS-A relationship

	    Task10Department(String deptName) {
	        this.deptName = deptName;
	    }
	    
	    public void showCourses() {
	    	courses = new Task10Course[3];
	    	courses[0] = new Task10Course("maths");
	    	courses[1] = new Task10Course("ps");
	    	courses[2] = new Task10Course("science");
	    	
	    	for(Task10Course c: courses) {
	    		System.out.println(c.getCourseName());
	    	}
	    	
	    }

}
