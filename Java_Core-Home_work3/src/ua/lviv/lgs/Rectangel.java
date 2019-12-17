package ua.lviv.lgs;

public class Rectangel {

	private String type;
	private int widht;
	private int hight;
	private int areaRectangel;
	private int perimeterRectangel;
	private String areaR;
	private String perimeterR;
	
	Rectangel () {
		this.type = "Rectangel";
	}
	
	
	Rectangel (String type, int widht, int hight) {
		this.type = type;
		this.widht = widht;
		this.hight = hight;
	}
	
	public 
	
	
	Rectangel (int widht, int hight) {
		this.widht = widht;
		this.hight = hight;
		this.areaRectangel = widht * hight;
		this.perimeterRectangel = widht + hight + widht + hight;
	}
	
	
	Rectangel (String areaR, String perimeterR) {
		this.areaR = areaR + " = тут буде площа";
		this.perimeterR = perimeterR + " = тут буде периметр";
	}
	

	
	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getWidht() {
		return widht;
	}


	public void setWidht(int widht) {
		this.widht = widht;
	}


	public int getHight() {
		return hight;
	}


	public void setHight(int hight) {
		this.hight = hight;
	}
	

	public int getAreaRectangel() {
		return areaRectangel;
	}


	public void setAreaRectangel(int areaRectangel) {
		this.areaRectangel = areaRectangel;
	}


	public int getperimeterRectangel() {
		return perimeterRectangel;
	}
	
	public void cetperimeterRectangel(int perimeterRectangel) {
		this.perimeterRectangel = perimeterRectangel;
	}
	
	public String getareaR () {
		return areaR;
	}
	
	public String getperimeterR () {
		return perimeterR;
	}
	
	
	
	public String toString () {
		return "Rectaingel [type="+type+", widht="+widht+", hight="+hight+", areaRectangel="+areaRectangel+", perimeterRectangel="+perimeterRectangel+", areaR="+areaR+", perimeterR="+perimeterR+"]";
	} 
	
}
