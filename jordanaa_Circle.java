import java.util.*;
public class jordanaa_Circle {
	private double radius;
	private double circumference;
	private double area;
	private Date dateCreated;

	public jordanaa_Circle() {
		radius = 0.0;
		circumference = 0.0;
		area = 0.0; 
		dateCreated = new Date();
	}

	public jordanaa_Circle(double r) {
		radius = r;
		dateCreated = new Date();
	}

	public double getRadius() {
		return radius;
	}

	public double getCircumference() {
		circumference = circleCirc(radius);
		return circumference;
	}

	public double getArea() {
		area = circleArea(radius);
		return area;
	}

	public Date getDate() {
		return dateCreated;
	}

	public void setRadius(double r) {
		radius = r;
	}

	public double circleArea(double radius) {
		double area = (Math.PI * (radius * radius));
		return area;
	}

	public double circleCirc(double radius) {
		double circ = (2 * Math.PI * radius);
		return circ;
	}
}
