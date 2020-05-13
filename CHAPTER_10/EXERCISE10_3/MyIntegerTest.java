package excercise10_3;

/**
 * Program to test the MyInteger object class
 * @author Nicholas Farish
 * @date 05/12/20
 */
public class MyIntegerTest {

	public static void main(String[] args) {
		
		String myString = "123";
		char myArray[] = new char[]{'1','2','3'};
		MyInteger int1 = new MyInteger(5);
		MyInteger int2 = new MyInteger(5);
		MyInteger int3 = new MyInteger(8);
		
		System.out.println("The value of int1 is: " + int1.value);
		System.out.println("Is the integer even? " + int1.isEven());
		System.out.println("Is the integer odd? " + int1.isOdd());
		System.out.println("Is the integer a prime number? " + int1.isPrime());
		System.out.println("Are two integers equal: " + int1.equals(int2));
		
		System.out.println("The value of int3 is: " + int3.value);
		System.out.println("Is the integer even? " + int3.isEven());
		System.out.println("Is the integer odd? " + int3.isOdd());
		System.out.println("Is the integer a prime number? " + int3.isPrime());
		System.out.println("Are two integers equal: " + int1.equals(int3));
		
		System.out.println("The array is converted to: " + MyInteger.parseInt(myArray));
		System.out.println("The string is converted to: " + MyInteger.parseInt(myString));
	}

}
