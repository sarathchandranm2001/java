import java.io.*;

class Largest {	
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
			if(Num1 > Num2 && Num1 > Num3)
				System.out.println(Num1+" is largest!");
			else if(Num2 > Num3)
				System.out.println(Num2+" is largest!");
			else
				System.out.println(Num3+" is largest!");
		}
		catch (Exception e) {
			System.out.println("Error: "+e);
		}

	}

}