package quiz3;

public class Triangle {
	

	private double side1; 
	private double side2; 
	private double side3; 
	
	public Triangle(){
		side1 = 1;
		side2 = 1;
		side3 = 1;
	}
	
	public Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double getSide1(){
		return side1;
	}

	public double getSide2(){
		return side2;
	}
	
	public double getSide3(){
		return side3;
	}
	
	public double p = (side1 + side2 + side3)/2;
	
	public double getArea(){
		return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
	}
	public double getPerimeter(){
		return (side1 + side2 + side3);
	}
	public String toString(){
		return ("The length of side 1 is " + side1 + ", the length of side 2 is " + side2+ ", and the length of side 3 is" + side3 + ". The area of this triangle is " + Double.toString(getArea()) + " and the perimeter of this triangle is " + Double.toString(getPerimeter()));
	}

}
