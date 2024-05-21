import java.util.*;

interface Shape{
	public void disp();
	public double calc();
}

class Rectangle implements Shape{
	double l,b;
	public Rectangle(double len, double bre){
		l = len;
		b = bre;
	}
	public void disp(){
		System.out.println("Shape is Rectangle with length "+l+" and bredth "+b+"\nArea = "+calc());
	} 
	public double calc(){
		return l*b;
	}
}

class Circle implements Shape{
	double r;
	public Circle(double rad){
		r = rad;
	}
	public void disp(){
		System.out.println("Shape is Circle with radius "+r+"\nArea = "+calc());
	} 
	public double calc(){
		return 3.14*r*r;
	}
}

class InterfaceShape{
	public static void main(String args[]){
		System.out.print("\nShapes\n------\n1. Rectangle\n2. Circle\nEnter you choice: ");
		Scanner s = new Scanner(System.in);
		int ch = s.nextInt();
		if(ch==1){
			System.out.print("\nEnter length and bredth: ");
			double len = s.nextDouble();
			double bre = s.nextDouble();
			Shape obj = new Rectangle(len, bre);
			obj.disp();
		}
		else{
			System.out.print("\nEnter radius: ");
			double rad = s.nextDouble();
			Shape obj = new Circle(rad);
			obj.disp();
		}
	}
}