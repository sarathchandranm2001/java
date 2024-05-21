import java.io.*;

class Sum {	
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
			System.out.println("Sum of "+Num1+" and "+Num2+" is "+(Num1*Num2));
		}
		catch (Exception e) {
			System.out.println("Error: "+e);
		}

	}

}