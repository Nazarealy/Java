package FirstLab;

public class Puzzle {

	private String guality;
	private double area;
	String description;
	public static int elements;
	protected double width;
	protected double height;

	public String getGuality() {
		return guality;
	}

	public void setGuality(String guality) {
		this.guality = guality;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	//----------------------------------
	
	public Puzzle() {}
	
	public Puzzle(double area, String description, double width, double height) {
		
		this.area = area;
		this.description = description;
		this.width = width;
		this.height = height;
	}
	
	public Puzzle(String guality, double area, String description, double width, double height) {
		this(area, description, width, height);
		this.guality = guality;
	}
	
	@Override
	public String toString() {
		return "Puzzle [guality=" + guality + ", area=" + area + ", description=" + description + ", width=" + width
				+ ", height=" + height + "]";
	}
	
	public void resetValues(String guality, double area, String description, double width, double height) {
		this.guality = guality;
		this.area = area;
		this.description = description;
		this.width = width;
		this.height = height;
	}
	
	//--------------------------

	public static void printStaticElements() {
		elements = 100;
		System.out.println("The static elements = "+elements);
	}


	public static void main(String[] args) {

		Puzzle a1 = new Puzzle();
		Puzzle a2 = new Puzzle("well", 32.5, "strange", 3.6, 6.2);
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		Puzzle a3 = new Puzzle();
		a3.resetValues("good", 3.5, "fruits", 5.3, 8);
		System.out.println(a3.toString());
		printStaticElements();
		//-------------
		Puzzle a4 = new Puzzle(32.2, "cow", 3.4, 7);
		a4.setGuality("few");
		System.out.println(a4.toString());
		//------------

	}
	

}
