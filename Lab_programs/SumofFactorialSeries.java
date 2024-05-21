import java.util.*;

class SumofFactorialSeries {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n = scanner.nextInt();
		double sum = 0;
		double factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial *= i;
			sum += i / factorial;
		}
		System.out.println("Sum of the series: " + sum);
	}
}