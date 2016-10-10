public class TriangleClass extends geometricObject {

	private double side1;
	private double side2;
	private double side3;

	private TriangleClass() {
		/*
		 * no arg constructor that creates a default triangle 
		 */
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;

	}

	public TriangleClass(double side1, double side2, double side3) {
		/*
		 * a constructor that creates a specified triangle with specified sides 1,2, and 3
		 */
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;

	}

	public double getside1() {
		return this.side1;
	}

	public double getside2() {
		return this.side2;
	}

	public double getside3() {
		return this.side3;
	}
	
	//public double getArea(double side1, double side2, double side3){
	 //}
	public double getPerimeter(double side1, double side2, double side3) {
		return (side1 + side2 + side3);
	}

}