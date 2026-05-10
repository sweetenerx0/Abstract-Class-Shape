
public class Sphere extends Shape {
	private double radius;
	
	public Sphere(double radius) {
	this.radius = radius;	
	}
	public double sphereArea() {
		return Math.PI * 4 * radius * radius; 
	}
	public double sphereVolume() {
		return Math.PI * (4.0/3.0) * Math.pow(radius, 3);
	}
	@Override
	public String toString() {
		return "SPHERE: Surface Area " + sphereArea() + ". Volume " + sphereVolume() +".";
	}
	@Override
	public double surface_area() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}
}
