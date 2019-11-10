package shapes;
/**
 * A <code>Triangle</code> object represents a Triangle with
 * a base, height, color, (x,y) position, and boolean filled
 * @author JosephSalerno
 * @author BrendanOlski
 * @author MitchellThomas
 * Class: Triangle.java
 * Project: 3
 */

public class Triangle extends StraightLineShape{
	
	
	//class variables
	public static final String DEFAULT_COLOR = "Black";
	public static final int DEFAULT_POSITION = 0;
	public static final int DEFAULT_BASE= 1;
	public static final int DEFAULT_HEIGHT = 1;
	public static final boolean DEFAULT_FILL = false;
	
	//instance variables
	private int base;
	private int height;
	private int[] xCoords = new int[3];
	private int[] yCoords = new int[3];

	/**
	 * Constructor to create a Triangle given a base, height, color, fill, and position x and y,
	 * additionally calculating the coordinate locations of the shape.
	 * @param base - integer length for the bottom side of the triangle
	 * @param height - integer height of the triangle
	 * @param color - A string representing the color of the shape
	 * @param x - the x-coordinate of the shape
	 * @param y - the y-coordinate of the shape
	 * @param filled - boolean representing if the shape is filled or not
	 *
	 */
	public Triangle (int base, int height, String color, int x, int y, boolean filled)
	{
		this.base = base;
		this.height = height;
	    this.color = color;
	    this.x = x;
	    this.y = y;
	    this.filled = filled;
	    
	    this.calculateCoords();
	}
	
	/**
	 * Constructor to create a Triangle with no parameters 
	 * and just the DEFAULT values given by the program.
	 */
	public Triangle() {
		this(DEFAULT_BASE, DEFAULT_HEIGHT, DEFAULT_COLOR, DEFAULT_POSITION, DEFAULT_POSITION, DEFAULT_FILL );
		this.calculateCoords();
	   }
	
	public void calculateCoords()
	{
		xCoords[0] = (base/2)+x;
		xCoords[1] = (base+x);
		xCoords[2] = x;
		
		yCoords[0] = y;
		yCoords[1] = yCoords[2] = (height+y);
		
	}
	/**
	 * Returns the integer base of the triangle
	 * @return base of the triangle
	 */
	public int getBase()
	{
		return base;
	}
	
	/**
	 * Returns the integer height of the triangle
	 * @return height of the triangle
	 */
	public int getHeight()
	{
		return height;
	}
	
	/**
	 * Sets the base to a new value, updates coords
	 * @param newBase - new base value of the triangle
	 */
	public void setBase(int newBase)
	{
		this.base = newBase;
		this.calculateCoords();
	}
	
	/**
	 * Sets the height to a new value, updates coords
	 * @param newHeight - new height value of the triangle
	 */
	public void setHeight(int newHeight)
	{
		this.height = newHeight;
		this.calculateCoords();
	}
	
	/**
	 * Sets the x position to a new value, updates coords
	 * @param newX - new x position of the triangle
	 */
	public void setX(int newX)
	{
		this.x = newX;
		this.calculateCoords();
	}
	
	/**
	 * Sets the y position to a new value, updates coords
	 * @param newY - new y position of the triangle
	 */
	public void setY(int newY)
	{
		this.y = newY;
		this.calculateCoords();
	}
	
	/**
	 * Returns an int[] of the x coordinates of the triangle
	 * @return an integer array with x coordinates
	 */
	public int[] getXCoordinates()
	{
		return xCoords;
		
	}
	
	/**
	 * Returns an int[] of the y coordinates of the triangle
	 * @return an integer array with each y coordinate 
	 */
	public int[] getYCoordinates()
	{
		return yCoords;
	}

	/**
	 * Returns a double[] of the three outer sides of the triangle
	 * @return a double array with all 3 sides of the triangle
	 */
	public double[] getSides()
	{
		double hypotenuse = Math.sqrt((Math.pow(base/2,2) + Math.pow(height,2)));
		double[] sides = new double[3];
		sides[0] = sides[2] = hypotenuse;
		sides[1] = base;
		return sides;
	}
	
	/**
	 * Returns the perimeter of the triangle
	 * @return the perimeter as a double
	 */
	public double getPerimeter()
	{
		double[] sides = getSides();
		double perimeter = 0;
		for(int x = 0; x < sides.length; x++)
		{
			perimeter += sides[x];
		}
		return perimeter;
	}
	
	/**
	 * Returns the string representation of the triangle
	 * @return a string representing the triangle
	 */
	public String toString() {
	      String str = "===Triangle===\n";
	      str += "Base width: " + base + "\n";
	      str += "Height: " + height + "\n";
	      str += "Coordinates: ";

	      for(int index = 0; index<xCoords.length; ++index)
	      {
	    	  str+= "(" + xCoords[index] + "," + yCoords[index] + "), ";
	      }
	      
	      str += "\nPosition: " + x + "," + y + "\n";
	      str += "Color: " + color + "\n";
	      str += "Filled: " + filled + "\n\n";
	      
	      double[] sides = getSides();
	      for(int x = 0; x<sides.length; x++)
	      {
	    	  str += "Side " + (x + 1) + ": " + sides[x] + "\n";
	      }
	      str += "Perimeter: " + getPerimeter() + "\n";
	      str += "\n==========\n";
	      
	      return str;
	   }
	   
	/*
    	* Method to test the equality of two shapes.
    	* @param Object other - a different shape object 
    	* @return true/false depending on equality of shape objects
    	*/   
	public boolean equalsTo(Object other) {
        	if (this == other) {
            		return true;
        	} else if (! (other instanceof Triangle)) {
            		return false;
        	} else {
            		Triangle t2 = (Triangle) other;
            		return (this.filled == t2.filled && this.color == t2.color && this.x == t2.x && this.y == t2.y && this.base == t2.base && this.height == t2.height);
        	}
    	}
}
	      
	

