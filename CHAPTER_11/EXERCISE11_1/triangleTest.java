package exercise11_1;
import java.util.Scanner;

/**
 * Test program for the triangle class with 
 * superclass GeometricObject
 * @author Nicholas Farish
 *@date 05/19/20
 */
public class triangleTest {

	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);
		//prompt for input and declare variables
		System.out.print("Enter three numbers, "
				+ "seperated by a \nspace, for the sides"
				+ " of a triangle: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		System.out.print("\nEnter a color: ");
		String color = input.next();
		System.out.print("\nIs the triangle filled? Enter true or false: ");
		boolean filled = input.hasNextBoolean();
		
		//create object using Triangle class and user input
		Triangle triangle1 = new Triangle(a, b, c, color, filled);
		
		//display the properties of the created triangle1
		System.out.println("\nThe area of the triangle is: " + triangle1.getArea() +
				"\nThe perimeter is: " + triangle1.getPerimeter() +
				"\nThe color is: " + triangle1.getColor() +
				"\nThe date created is: " + triangle1.getDateCreated() +
				"\nIs the triangle filled? " + triangle1.isFilled());
	}
}
