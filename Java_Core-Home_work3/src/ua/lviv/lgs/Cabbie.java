package ua.lviv.lgs;

// цей клас оприділяє Cabbie та присвоює Cab

public class Cabbie {  //імя класу
	
	//Місце для вказання значення commpanyName
	private static String companyName = "Blue Cab Company";
	
	//атрибути name що відносяться до Cabbie 
	private String Name; 
	
	// Зсилка
	private Cab myCab;  
	
	// Корструктор по замовчуванні для Cabbie 
	public Cabbie() {
		Name = null;
		myCab = null;

		
	
	//Конструктор для ініціалізації name для Cabbie 
	public Cabbie(String iName, String serialNumber) {
		Name = iName;
		myCab = new Cab(serialNumber);
				}
	
	// Задання значення для name яке відноситься до Cabbie 
	public void setName (String iName) {
		Name = iName;
	} 
	
	// Вивід значеення compannyName 
	public static string getName() {
		return Name;
	} 
	
	// Вивід значеення Name яке відноситься до Cabbin
	public static String getCompanyName() {
		return companyName;
					}  
	
	  //відкритий інтерфейс 
	public void giveDestination() {
		
	}
	
	// Закрита реалізація 
	private void turnRight() {}
	
	private void turnLeft()
		
	}
	

