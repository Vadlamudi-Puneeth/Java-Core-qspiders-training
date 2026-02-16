package practiseq3;

public class CarRentals {

	private final String[] CAR_TYPE = { "SUV", "Sedan", "Hatchback" };
	private final String[] FUEL_TYPE = { "Petrol", "Diesel", "Electric" };

	void validateUserDetails(int age, String phoneNumber, String licenseNumber) throws InvalidRentalDetailsException {

		if (age <= 18) {
			throw new InvalidRentalDetailsException("Invalid Age");
		}

		if (phoneNumber.length() != 10 || !phoneNumber.matches("[0-9]{10}")) {
			throw new InvalidRentalDetailsException("Invalid phone number");
		}

		String sub1 = licenseNumber.substring(0, 5);

		for (int i = 0; i < sub1.length(); i++) {
			char ch = sub1.charAt(i);
			if (!Character.isAlphabetic(ch) || !Character.isUpperCase(ch)) {
				throw new InvalidRentalDetailsException("Invalid license number");
			}
		}

		String sub2 = licenseNumber.substring(5, 8);
		for (int i = 0; i < sub2.length(); i++) {
			char ch = sub2.charAt(i);
			if (!Character.isDigit(ch)) {
				throw new InvalidRentalDetailsException("Invalid license number");
			}
		}

	}

	void validateCarDetails(String carType, String fuelType) throws InvalidRentalDetailsException {
		boolean flag = false;

		for (int i = 0; i < CAR_TYPE.length; i++) {
			if (carType.equals(CAR_TYPE[i])) {
				flag = true;
			}
		}

		if (flag == false) {
			throw new InvalidRentalDetailsException("Invalid license number");
		}

		flag = false;
		for (int i = 0; i < FUEL_TYPE.length; i++) {
			if (fuelType.equals(FUEL_TYPE[i])) {
				flag = true;
			}
		}

		if (flag == false) {
			throw new InvalidRentalDetailsException("Invalid Fuel Type");
		}

	}

	void validateDaysAndDistance(int noofDays, int distanceToBeTravelled) throws InvalidRentalDetailsException {

		if (noofDays <= 0) {
			throw new InvalidRentalDetailsException("Invalid number of days");
		}

		if (distanceToBeTravelled <= 10) {
			throw new InvalidRentalDetailsException("Invalid distance to be traveled");
		}

	}

	public double calculateRentalCost(String carType, String fuelType, int noOfDays, int distanceToBeTraveled) {

		double baseRate = 0;
		double distanceRate = 0;

		// Normalize input (case-insensitive handling)
		carType = carType.toLowerCase();
		fuelType = fuelType.toLowerCase();

		// Determine base rate
		if (carType.equals("suv")) {
			baseRate = 1500;
		} else if (carType.equals("sedan")) {
			baseRate = 1100;
		} else if (carType.equals("hatchback")) {
			baseRate = 800;
		} else {
			return -1; // Invalid car type
		}

		// Determine distance rate
		if (fuelType.equals("petrol")) {
			if (carType.equals("suv"))
				distanceRate = 25.5;
			else if (carType.equals("sedan"))
				distanceRate = 22;
			else
				distanceRate = 21;
		} else if (fuelType.equals("diesel")) {
			if (carType.equals("suv"))
				distanceRate = 23.5;
			else if (carType.equals("sedan"))
				distanceRate = 20;
			else
				distanceRate = 19;
		} else if (fuelType.equals("electric")) {
			if (carType.equals("suv"))
				distanceRate = 19.5;
			else if (carType.equals("sedan"))
				distanceRate = 16;
			else
				distanceRate = 15;
		} else {
			return -1; // Invalid fuel type
		}

		return (baseRate * noOfDays) + (distanceRate * distanceToBeTraveled);
	}

}
