package operator;

public class Task5 {
	public static void main(String args[]){
		boolean isPhysicallyChallanged = false;
		int attendance = 61;
		boolean isApprovedByAdministrator = true;
		int extra_minutes = 30;
		int totalExamDuration = 90;
		
		totalExamDuration = (isPhysicallyChallanged == true || (attendance < 60 && isApprovedByAdministrator == true))? (totalExamDuration+=extra_minutes):totalExamDuration;
		System.out.println(totalExamDuration);
		
	}
}
