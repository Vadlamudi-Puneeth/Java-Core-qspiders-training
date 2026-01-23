package week3;

public class Task10University {
	private String name;
    private Task10Department dept;

    Task10University(String name) {
        this.name = name;
        this.dept = new Task10Department("CSE");
    }

    public void displayCourses() {
        System.out.println("University: " + name);
        dept.showCourses();
    }
}