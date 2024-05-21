import java.util.*;

class Student {
	String name;
	int age;
	int rollno;
	public void readStudent() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Student Details:\nEnter Name: ");
		name = s.nextLine();
		System.out.print("Enter Age: ");
		age = s.nextInt();
		System.out.print("Enter Roll No: ");
		rollno = s.nextInt();
	}
	public void dispDetails() {
		System.out.print("\nStudent details\nName: "+name+"\nAge: "+age+"\nRoll No: "+rollno);
	}	
}

class Teacher extends Student{
	String name;
	int age;
	String subject;
	public void readTeacher() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Teacher Details:\nEnter Name: ");
		name = s.nextLine();
		System.out.print("Enter Age: ");
		age = s.nextInt();
		s.nextLine();
		System.out.print("Enter Subject: ");
		subject = s.nextLine();
	}
	public void dispDetails() {
		System.out.print("\n\nTeacher details\nName: "+name+"\nAge: "+age+"\nSubject: "+subject);
	}	
}

class Inheritance {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.print("\n\nMenu\n----\n1. Teacher\n2. Student\nEnter choice:");
		int ch = s.nextInt();
		if(ch==1){
			Teacher obj = new Teacher();
			obj.readTeacher();
			obj.dispDetails();
		}
		else{
			Student obj = new Student();
			obj.readStudent();
			obj.dispDetails();
		}
	}
}