package week1.day1;

public class Factorial {
	// input = 5
	// Output= 5*4*3*2*1 =120
	// Consider 1*2*3*4*5 = 120

	public static void main(String[] args) {

		int n = 5;
		int output = 1;

		for (int i = 1; i <= n; i++) {

			output = output * i;

		}
		System.out.println(output);

	}

}
