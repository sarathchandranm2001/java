import java.util.*;

class Reverse {
	public void rev_num() {
		int num, rev = 0 ;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = Integer.parseInt(s.nextLine());
		while(num!=0) {
			rev = rev*10 + (num%10);
			num = num/10;
		}
		System.out.print("Reveresed number: "+rev);
	}
}

class ReverseofNumber {
	public static void main(String args[]) {
		Reverse obj = new Reverse();
		obj.rev_num();
	}
}