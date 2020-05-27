package exercise12_3;
import java.util.*;

/**
 * Program to make an array and throw an exception
 * when the index is out of bounds.
 * @author Nicholas Farish
 * @date 05/26/20
 */
public class arrayException
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] myArray = new int[100];
		for (int i = 0; i < myArray.length; i++)
		{
			myArray[i] = (int)(Math.random() * 100  + 1);
		}
		System.out.print("Enter an index between 0 and 99: ");
		int index = input.nextInt();
		try
		{
			System.out.print("The value of index " + index + " is: " + myArray[index]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.print("The index you have entered is out of bounds.");
		}

	}
}
