/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
public class MArray
{
	public static void main(String[] args) {
    	int a[],n,i;
    	DataInputStream din = new DataInputStream(System.in);
    	try {
    	    System.out.println("Ente n");
    	    n = Integer.parseInt(din.readLine());
    	    a = new int[n];
    	    for(i = 0;i < n;i++)
    	    {
    	        System.out.println("Enter a[" + i + "]");
    	        a[i] = Integer.parseInt(din.readLine());
    	    }
    	    for(i=0;i < n;i++)
    	    {
    	        System.out.println(a[i]);
    	    }
    	} 
	catch(Exception e) {
		System.out.println(e);
    	}
	}
}
