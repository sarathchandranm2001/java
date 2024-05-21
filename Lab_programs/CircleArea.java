import java.util.*;

class Circle {
	public void area() {
		double rad, area;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter radius of circle: ");
		rad = Double.parseDouble(s.nextLine());
		area = 3.14 * rad * rad;
		System.out.print("Area of Circle is: "+area); 
	}
}

class CircleArea {
	public static void main(String args[]) {
		Circle obj = new Circle();
		obj.area();
	}
}