/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
public class Main
{
	public static void main(String[] args) {
    	int a[][],r,c,i,j;
    	DataInputStream din = new DataInputStream(System.in);
    	try {
    	    System.out.println("Ente the no of rows and columns");
    	    r = Integer.parseInt(din.readLine());
    	    c = Integer.parseInt(din.readLine());
    	    a = new int[r][];
    	    for(i = 0;i < r;i++)
    	    {
    	        a[i] = new int[c+i];
    	        for(j = 0;j < c+i;j++)
    	        {
    	            System.out.println("Enter a[" + i + "][" + j + "]");
    	            a[i][j] = Integer.parseInt(din.readLine());
    	        }
    	    }
    	    for(i=0;i < r;i++)
    	    {
    	        for(j = 0;j < c+i;j++)
    	        {
    	            System.out.print(a[i][j] + "\t");
    	        }
    	        System.out.println("");
    	    }
    	} catch(Exception e) {
    	}
	}
}
