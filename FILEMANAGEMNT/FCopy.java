
import java.io.*;
import java.util.Scanner;
public class FCopy {
	public static void main(String args[]) {
		FileInputStream fin;
		FileOutputStream fout;
		Scanner s=new Scanner(System.in);
		String sname,dname;
		try {
			System.out.println("Enter the Source file name :");
			sname=s.nextLine();
			System.out.println("Enter the destination file :");
			dname=s.nextLine();
			fin=new FileInputStream(sname);
			fout=new FileOutputStream(dname);
			byte b[];
			b=new byte[5];
			int n=fin.read(b,0,5);
			while(n!=-1)
			{
				fout.write(b,0,n);
				n=fin.read(b,0,5);
			}
			fin.close();
			fout.close();
		}
		catch(Exception e){
			System.out.println("Error"+e);
			
		}
		
		
	}
}
