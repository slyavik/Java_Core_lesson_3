package ua.lviv.lgs;

public class Application_animal {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.setName("jone");
		a.setAge(55);
		a.setColor("Black");
		
		Animal a1 = new Animal (25);
		
		Animal a2 = new Animal ("Gorylla","Mike", 50, "Braun");
		
		
		
	
	System.out.println(a);
	System.out.println();
	System.out.println(a1.getAge());
	System.out.println();
	System.out.println(a2);
	
	}
}
