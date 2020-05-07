 /**
  * A class to create a rectangle object given the 
  * arguments height and width
  * Author Nic Farish
  * Date 4/20/20
  */
package exercise9_1;

public class Rectangle {
	
	double height = 1;
	double width = 1;
	
	public Rectangle () {
		
	}
	
	public Rectangle (double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	public double getArea(double a, double b) {
		Double height = a;
		Double width = b;
		
		return a * b;
	}
	
	public double getPerimeter(double a, double b) {
		Double height = a;
		Double width = b;
		
		return (a + b) * 2;
	}

}
