import java.util.Scanner;

class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for rectangle 1
        System.out.println("Enter length of Rectangle 1:");
        double length1 = scanner.nextDouble();
        System.out.println("Enter width of Rectangle 1:");
        double width1 = scanner.nextDouble();

        // Get input for rectangle 2
        System.out.println("Enter length of Rectangle 2:");
        double length2 = scanner.nextDouble();
        System.out.println("Enter width of Rectangle 2:");
        double width2 = scanner.nextDouble();

        // Create two rectangle objects
        Rectangle rectangle1 = new Rectangle(length1, width1);
        Rectangle rectangle2 = new Rectangle(length2, width2);

        // Display area and perimeter of rectangle 1
        System.out.println("\nRectangle 1:");
        System.out.println("Area: " + rectangle1.area());
        System.out.println("Perimeter: " + rectangle1.perimeter());

        // Display area and perimeter of rectangle 2
        System.out.println("\nRectangle 2:");
        System.out.println("Area: " + rectangle2.area());
        System.out.println("Perimeter: " + rectangle2.perimeter());

        // Check if the two rectangles have the same area
        if (rectangle1.area() == rectangle2.area()) {
            System.out.println("\nThe two rectangles have the same area.");
        } else {
            System.out.println("\nThe two rectangles do not have the same area.");
        }

        // Close scanner
        scanner.close();
    }
}
