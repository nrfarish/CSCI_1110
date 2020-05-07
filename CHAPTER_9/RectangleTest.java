package exercise9_1;

public class RectangleTest {

	public static void main(String[] args) {

		Rectangle recDefault = new Rectangle();
		Rectangle rectangle1 = new Rectangle(4, 40);
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		
		
		System.out.println(rectangle1.height);
		System.out.println(rectangle1.width);
		System.out.println(rectangle1.getArea
				(rectangle1.height, rectangle1.width));
		System.out.println(rectangle1.getPerimeter
				(rectangle1.height, rectangle1.width));
		System.out.println(rectangle2.height);
		System.out.println(rectangle2.width);
		System.out.println(rectangle2.getArea
				(rectangle2.height, rectangle2.width));
		System.out.println(rectangle2.getPerimeter
				(rectangle2.height, rectangle2.width));
		System.out.println(recDefault.height);
		System.out.println(recDefault.width);
		System.out.println(recDefault.getArea
				(recDefault.height, recDefault.width));
		System.out.println(recDefault.getPerimeter(
				recDefault.height, recDefault.width));
	}

}