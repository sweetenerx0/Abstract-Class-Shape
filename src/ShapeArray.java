import java.util.Scanner;

public class ShapeArray {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter a radius value ");
		double radius = scnr.nextDouble();
		System.out.println("Enter a height value ");
		double height = scnr.nextDouble();
		
		Shape sphere = new Sphere(radius);
		Shape cylinder = new Cylinder(radius, height);
		Shape cone = new Cone(radius, height);
		Shape [] shapeArray = {sphere, cylinder, cone};
		System.out.println("----Here are your surface areas and volumes of your shapes----");
		for (Shape shape : shapeArray) {
			System.out.println(shape);
		}
		
	}
}
