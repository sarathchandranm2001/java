import java.io.*;

class Swap {	
	public static void main(String args[]) {

		DataInputStream dis;
		dis = new DataInputStream(System.in);
		int Num1, Num2, Temp;

		try {
			System.out.println("Enter two numbers: ");
			System.out.println("Number 1: ");
			Num1 = Integer.parseInt(dis.readLine());
			System.out.println("Number 2: ");
			Num2 = Integer.parseInt(dis.readLine());
			System.out.println("Before Swapping: First Number is "+Num1+" and Second Number is "+Num2);
			Temp = Num1;
			Num1 = Num2;
			Num2 = Temp;
			System.out.println("After Swapping: First Number is "+Num1+" and Second Number is "+Num2);
		}
		catch (Exception e) {
			System.out.println("Error: "+e);
		}

	}

}