import java.io.*;

class Samllest {	
	public static void main(String args[]) {

		DataInputStream dis;
		dis = new DataInputStream(System.in);
		int Num1, Num2, Num3;

		try {
			System.out.println("Enter three numbers: ");
			System.out.println("Number 1: ");
			Num1 = Integer.parseInt(dis.readLine());
			System.out.println("Number 2: ");
			Num2 = Integer.parseInt(dis.readLine());
			System.out.println("Number 3: ");
			Num3 = Integer.parseInt(dis.readLine());
			System.out.println( Math.min(Math.min(Num1, Num2), Num3) +" is the smallest number!");
		}
		catch (Exception e) {
			System.out.println("Error: "+e);
		}

	}

}