package week1.day1;

public class Car {

	public void applyBreak() {
		System.out.println("apply break");

	}

	public void applyGear() {
		System.out.println("apply gear");

	}

	public void switchonAc() {
		System.out.println("switch on AC");
	}

	public void applyAcclerate() {
		System.out.println("apply accelerate");

	}

	public static void main(String[] args) {

		Car obj = new Car();
		obj.applyBreak();
		obj.applyGear();
		obj.switchonAc();
		obj.applyAcclerate();

	}

}
