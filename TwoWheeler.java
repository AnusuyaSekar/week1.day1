package week1.day1;

public class TwoWheeler {

	int noOfWheels = 4;
	short noOfMirrors = 2;
	long chassisNumber = 9823234;
	boolean isPunctured = false; // should be lower case
	String bikeName = "Fascino";
	double runningKM = 200234.89;

	public static void main(String[] args) {
		TwoWheeler obj = new TwoWheeler();
		System.out.println("No of Wheels is " + obj.noOfWheels);
		System.out.println("No of Mirrors is " + obj.noOfMirrors);
		System.out.println("Chasis Number is " + obj.chassisNumber);
		System.out.println("Is Punctured " + obj.isPunctured);
		System.out.println("Bike Name is " + obj.bikeName); // string cannot be placed inside main method
		System.out.println("Running KM is " + obj.runningKM);
	}

}
