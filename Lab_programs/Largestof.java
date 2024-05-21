import java.util.*;

class Largest {
	public int largestofTwo(int num1, int num2) {
		int largest;
		if(num1>num2)
			largest = num1;
		else 
			largest = num2;
		return largest;
	}
	public int largestofThree(int num1, int num2, int num3){
		return largestofTwo(largestofTwo(num1, num2), num3);
	}
}

class Largestof {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		Largest obj1 = new Largest();
		System.out.print("Enter three numbers: ");
		int num1 = Integer.parseInt(s.nextLine());
		int num2 = Integer.parseInt(s.nextLine());
		int num3 = Integer.parseInt(s.nextLine());
		System.out.print("Largest of the three numbers is: "+obj1.largestofThree(num1,num2,num3));
	}
}