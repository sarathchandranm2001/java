/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
class Person{
    int age;
    String name;
    public void read()
    {
        DataInputStream din = new DataInputStream(System.in);
        try {
            System.out.println("Enter the name and age");
            name = din.readLine();
            age = Integer.parseInt(din.readLine());
        } 
        catch(Exception e) {
        }
    }
    public void disp()
    {
        System.out.println("Name :  " + name + " Age :" + age);
    }
}
class Teacher extends Person{
    String subj;
    public void read()
    {
        super.read();
        DataInputStream din = new DataInputStream(System.in);
        try {
            System.out.println("Enter the Subject");
            subj = din.readLine();
        } 
        catch(Exception e) {
        }
    }
    public void disp()
    {
        super.disp();
        System.out.println("Subject : " + subj);
    }
}
public class Main
{
	public static void main(String[] args) {
		Person p;
		Teacher t;
		p = new Person();
		t = new Teacher();
		p.read();
		t.read();
		p.disp();
		t.disp();
	}
}