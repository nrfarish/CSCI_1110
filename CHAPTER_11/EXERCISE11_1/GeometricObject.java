package exercise11_1;

/**
 * Generalized class for geometric objects.
 * @author Nicholas Farish
 *@date 05/19/20
 */
public class GeometricObject 
{
	private java.util.Date dateCreated;
	private boolean filled = false;
	private String color = "white";
	
	
	public GeometricObject()
	{
		dateCreated = new java.util.Date();
	}
	
	public GeometricObject(boolean filled, String color)
	{
		dateCreated = new java.util.Date();
		this.filled = filled;
		this.color = color;
	}
	
	public String getColor()
	{
		return this.color;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public boolean isFilled()
	{
		return this.filled;
	}
	
	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}
	
	public java.util.Date getDateCreated()
	{
		return this.dateCreated;
	}
	
	public String toString()
	{
		return "Created " + dateCreated +
			"\nColor: " + color +
			"\nFilled: " + filled;
	}
}
