package ua.lviv.lgs;

// ��� ���� �������� Cabbie �� �������� Cab

public class Cabbie {  //��� �����
	
	//̳��� ��� �������� �������� commpanyName
	private static String companyName = "Blue Cab Company";
	
	//�������� name �� ���������� �� Cabbie 
	private String Name; 
	
	// ������
	private Cab myCab;  
	
	// ����������� �� ����������� ��� Cabbie 
	public Cabbie() {
		Name = null;
		myCab = null;

		
	
	//����������� ��� ����������� name ��� Cabbie 
	public Cabbie(String iName, String serialNumber) {
		Name = iName;
		myCab = new Cab(serialNumber);
				}
	
	// ������� �������� ��� name ��� ���������� �� Cabbie 
	public void setName (String iName) {
		Name = iName;
	} 
	
	// ���� ��������� compannyName 
	public static string getName() {
		return Name;
	} 
	
	// ���� ��������� Name ��� ���������� �� Cabbin
	public static String getCompanyName() {
		return companyName;
					}  
	
	  //�������� ��������� 
	public void giveDestination() {
		
	}
	
	// ������� ��������� 
	private void turnRight() {}
	
	private void turnLeft()
		
	}
	

