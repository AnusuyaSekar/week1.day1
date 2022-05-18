package week1.day1;

public class PrimeNumber {
	// Output=Prime Number of not
	// input=13
	// Concept=, a number divisible by same no and by 1 is prime
	// check the number is divisible by all the numbers lesser than that
	// 0 and 1 are prime numbers
	// 13/2. 13/3, 13/4, 13/5, 13/6...

	public static void main(String[] args) {

		int input = 13;
		boolean flag = true;

		if (input == 0 || input == 1) {
			System.out.println("Not a Prime Number");

		}

		for (int i = 2; i < input; i++) {

			if (input % i == 0) {
				System.out.println("Not a Prime Number");
				flag = false;
				break;
			}
			if (flag == true) {
				System.out.println(" Prime Number");
				break;

			}

		}

	}
}
