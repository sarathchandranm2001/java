/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
class Person{
    int age; 	//data members
    String name; 
    publci void setPerson(int a,String n)
    {
        age = a;
        name = n;
    }
    public void dispPerson() //member functions
    {
        System.out.println("Name :" + name + " Age : " + age);
    }
}
public class Main
{
	public static void main(String[] args) {
    	Person p,q;
    	p = new Person();
    	q = new Person();
    	p.setPerson(20,"abcd");
    	q.setPerson(30,"ddd");
    	p.dispPerson();
    	q.dipPerson();
	}
}
