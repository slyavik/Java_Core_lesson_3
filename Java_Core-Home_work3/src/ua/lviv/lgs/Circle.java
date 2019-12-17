package ua.lviv.lgs;

public class Circle {

	private String type;
	private float radius;
	private double diameter;
	private double areaC;
	private double lenghtC;
	
	Circle () {
		this.type = "Коло"; 
	}
	
	Circle (String type, double diameter) {
		this.diameter = diameter;
		this.areaC = 3.1415* ((diameter/2)*(diameter/2));
		this.type = type;
	}
	
	Circle (float radius, String type) {
		this.radius = radius;
		this.lenghtC = 2*3.1415*radius;
		this.type = type;
	}
	
	
	
	
	public String toString () {
		return "Circle [type="+type+", areaC = "+areaC+", lenghtC = "+lenghtC+"] ";
	}
	
}
