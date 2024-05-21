import java.io.*;

class SumofSeries { 
	
	public static void main(String args[]) {
		DataInputStream dis;
		dis = new DataInputStream(System.in);
		int n, Total_Sum = 0, New_Sum = 0, i = 1;
		try {
			System.out.print("Enter limit: ");
			n = Integer.parseInt(dis.readLine());	
			while(i <= n) {
				New_Sum = New_Sum + i; 
				Total_Sum = Total_Sum + New_Sum; 
				i++;
			}
			System.out.println("Sum of Series is "+Total_Sum);
		}
		catch(Exception e) {
			System.out.println("Error: "+e);
		}
	}
}