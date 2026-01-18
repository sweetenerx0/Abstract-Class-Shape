
public class Cylinder extends Shape{
	private double radius;
	private double height;
	
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	public double cylinderArea() {
		return (Math.PI*radius*height*2) + (2*Math.PI*radius*radius);
	}
	public double cylinderVolume() {
		return Math.PI * radius*radius*height;
	}
	@Override
	public String toString() {
		return "CYLINDER: Surface Area " + cylinderArea() + ". Volume" + cylinderVolume() +".";
	}
}
