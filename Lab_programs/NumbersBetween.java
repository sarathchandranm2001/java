import java.io.*;

class NumbersBetween {
	
	public static void main(String args[]) {
		DataInputStream dis;
		dis = new DataInputStream(System.in);
		int n, m, temp;
		try {
			System.out.print("Enter limits n and m: ");
			n = Integer.parseInt(dis.readLine());
			m = Integer.parseInt(dis.readLine());
			if(Math.max(n, m) == n) {
				temp = n;
				n = m;
				m = temp;
			}	
			while(n <= m) {
				System.out.print(n+"\t");
				n++;
			}
		}
		catch(Exception e) {
			System.out.println("Error: "+e);
		}
	}
}