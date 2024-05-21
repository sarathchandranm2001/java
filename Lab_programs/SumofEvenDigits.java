import java.util.*;

class SumEven {
	public int sumofEven() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a limit: ");
		int num = Integer.parseInt(s.nextLine());
		int sum = 0;
		for(int i=0;i<=num;i=i+2) {
			sum = sum + i;
		}
		return sum;
	}
}

class SumofEvenDigits {
	public static void main(String args[]) {
		int sum;
		SumEven obj = new SumEven();
		sum = obj.sumofEven();
		System.out.print("Sum of the even digits: "+sum);
			
	}
}