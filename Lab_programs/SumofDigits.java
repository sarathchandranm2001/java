import java.util.*;

class SumDigits {
	public int sumofDigits(int num) {
		int sum = 0;
		while(num!=0) {
			sum = sum + (num%10);
			num = num/10;
		}
		return sum;
	}
}

class SumofDigits {
	public static void main(String args[]) {
		int num, sum;
		SumDigits obj = new SumDigits();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = s.nextInt();
		sum = obj.sumofDigits(num);
		System.out.print("Sum of the digits of the number: "+sum);
			
	}
}