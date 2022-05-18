package week1.day1;

public class Mobile {

	public void makeCall() {
		System.out.println("Calling");

	}

	public void sendMsg() {
		System.out.println("Sending");

	}

	public static void main(String[] args) {

		Mobile obj = new Mobile();
		obj.makeCall();
		obj.sendMsg();

	}

}
