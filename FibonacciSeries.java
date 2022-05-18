package week1.day1;

public class FibonacciSeries {
	// Output = 0, 1, 1, 2, 3, 5, 8, 13
	// concept 1st no+ 2nd no = 3rd no
	// 0+1=1
	// 1+1=2
	// 1+2=3
	// 2+3=5
	// 3+5=8
	// 5+8=13

	public static void main(String[] args) {

		int n = 6;
		int firstNum = 0;
		int secondNum = 1;
		int sum;
		System.out.println(firstNum);
		System.out.println(secondNum);

		for (int i = 1; i <= n; i++) {
			sum = firstNum + secondNum;
			System.out.println(sum);
			firstNum = secondNum;
			secondNum = sum;

		}

	}

}
