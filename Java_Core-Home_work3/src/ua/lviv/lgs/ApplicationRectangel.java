package ua.lviv.lgs;

public class ApplicationRectangel {

	public static void main(String[] args) {
		
		Rectangel a1 = new Rectangel ();
		a1.setHight(20);
		a1.setWidht(80);
		
		Rectangel a2 = new Rectangel ("Rectangel-2", 100, 30);
		
		Rectangel a3 = new Rectangel (10, 5);
		
		Rectangel a4 = new Rectangel ("Площа прямокутника", "Периметр прямокутника");
		
		System.out.println(a1);
		System.out.println();
		System.out.println(a2);
		System.out.println();
		System.out.println(a3);
		System.out.println("Widht = " + a3.getWidht()+", Hight = "+ a3.getHight() );
		System.out.println("Area = " +  a3.getAreaRectangel()+", Area = " +  a3.getperimeterRectangel());
		System.out.println();
		System.out.println(a4);
		System.out.println(a4.getareaR());
		System.out.println(a4.getperimeterR());
		System.out.println();
		System.out.println("-----------------------------------");
		System.out.println();
	
	Circle b1 = new Circle ();
	
	Circle b2 = new Circle ("площа", 15);
	
	Circle b3 = new Circle(22,"Довжина");
	
	
	System.out.println(b1);
	System.out.println(b2);
	System.out.println(b3);
	
		
	}
	
}
