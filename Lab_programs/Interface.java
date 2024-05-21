import java.util.*;
import java.lang.Math;

interface Triangle{
	public void read();
	public double area();
}

class RightAngled implements Triangle{
	Scanner s = new Scanner(System.in);
	double b, h;
	public void read(){
		System.out.print("\nEnter the base and height:");
		b = s.nextDouble();
		h = s.nextDouble();
	}
	public double area(){
		return 0.5*b*h;
	}
}

class Equilateral implements Triangle{
	Scanner s = new Scanner(System.in);
	double a;
	public void read(){
		System.out.print("\nEnter the side:");
		a = s.nextDouble();
	}
	public double area(){
		return (Math.sqrt(3)/4)*a*a;
	}
}

class Isosceles implements Triangle{
	Scanner s = new Scanner(System.in);
	double a, b;
	public void read(){
		System.out.print("\nEnter the equal sides and base:");
		a = s.nextDouble();
		b = s.nextDouble();
	}
	public double area(){
		return 0.25*b*( Math.sqrt( (4*a*a) - (b*b) ) );
	}
}
class Interface {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.print("\n\nArea of Triangle\n--------------\n1. Right Angled\n2. Equilateral\n3. Isosceles\nEnter choice:");
		int ch = s.nextInt();
		Triangle obj;
		if(ch==1){
			obj = new RightAngled();
			obj.read();
			System.out.println("\nArea = "+obj.area());
		}
		else if(ch==2){
			obj = new Equilateral();
			obj.read();
			System.out.println("\nArea = "+obj.area());
		}
		else {
			obj = new Isosceles();
			obj.read();
			System.out.println("\nArea = "+obj.area());
		}
	}
}