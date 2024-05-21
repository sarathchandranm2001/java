import java.util.*;

class Fact {
	public int factorial(int num) {
		if(num>1)
			return num * factorial(num-1);
		else
			return 1;
	}
}

class Factorial {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		Fact obj = new Fact();
		System.out.print("Enter a number: ");
		int num = s.nextInt();
		System.out.print("Factorial of the number is: "+obj.factorial(num));
	}
}