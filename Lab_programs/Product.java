import java.io.*;

class Product {	
	public static void main(String args[]) {

		DataInputStream dis;
		dis = new DataInputStream(System.in);
		int Num1, Num2;

		try {
			System.out.println("Enter two numbers: ");
			System.out.println("Number 1: ");
			Num1 = Integer.parseInt(dis.readLine());
			System.out.println("Number 2: ");
			Num2 = Integer.parseInt(dis.readLine());
			System.out.println("The Product of the numbers is: "+(Num1*Num2));
		}
		catch (Exception e) {
			System.out.println("Error: "+e);
		}

	}

}