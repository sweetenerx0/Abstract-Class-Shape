
public class Cone extends Shape {
	private double radius;
	private double height;
	
	public Cone(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	public double coneArea(){
		double slant = Math.sqrt(radius * radius + height *height);
		return (Math.PI * radius *radius) + (Math.PI * radius * slant);
	}
	public double coneVolume() {
		return (Math.PI *radius*radius*height) / 3.0;
	}
	@Override
	public String toString() {
		return "CONE: Surface Area " + coneArea() + ". Volume " + coneVolume() +".";
	}
}
