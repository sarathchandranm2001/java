import java.util.*;

class EvenNumDisp {
	public static void evenPrint(int num) {
		for(int i=0; i<=num; i=i+2){
			System.out.print(i+" ");
		}
	}
	
}

class EvenNumbers {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = s.nextInt();
		System.out.print("Even numbers are: \n");
		EvenNumDisp.evenPrint(num);
	}
}