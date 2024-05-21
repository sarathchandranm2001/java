import java.util.*;

class Employee {
	String ename;
	int eno;
	int esal;
	public void readEmployee() {
		Scanner s = new Scanner(System.in);
		System.out.print("\nEnter Employee Details:\nEnter Employee No: ");
		eno = s.nextInt();
		s.nextLine();
		System.out.print("Enter Name: ");
		ename = s.nextLine();
		System.out.print("Enter Salary: ");
		esal = s.nextInt();
	}
	public void dispEmployee() {
		System.out.print("\nEmployee details\nEmployee No: "+eno+"\nName : "+ename+"\nSalary: "+esal);
	}
}

class EmployeeDetails {
	public static void main(String args[]) {
		int i, n, eno;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of Employee: ");
		n = s.nextInt();
		Employee obj[] = new Employee[n];
		for(i=0; i<n; i++){
			obj[i] = new Employee();
			System.out.print("\nEnter details of Employee "+(i+1)+":\n");
			obj[i].readEmployee();
		}
		System.out.print("\nEmployee Details!\n-----------------");
		for(i=0; i<n; i++){
			System.out.print("\nEmployee "+(i+1)+":\n ");
			obj[i].dispEmployee();
		}
		System.out.print("\nEnter an employee no to search: ");
		eno = s.nextInt();
		for(i=0; i<n; i++){
			if(obj[i].eno == eno){
				System.out.print("\nEmployee found: ");
				obj[i].dispEmployee();
				break;
			}
		}
		if(i==n)
			System.out.print("\nEmployee not found!");
	}
}