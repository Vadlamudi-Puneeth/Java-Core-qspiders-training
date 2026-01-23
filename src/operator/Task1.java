package operator;

public class Task1 {
	public static void main(String args[]) {
		int StudentMarks = 55;
		int StudentAttendance = 74;
		
		String res = (StudentMarks >= 40 && StudentAttendance >= 75) ? "pass": "fail";
		
		int finalMarks = (res.equals("pass")) ? (StudentMarks + 5) : StudentMarks;
		
		System.out.println(finalMarks);
		
	}
}
