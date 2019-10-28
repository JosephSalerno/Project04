package shapes;

/**
 * A <code>Octagon</code> object represents an Octagon with
 * a width, height, color, (x,y) position, and boolean filled
 * @author JosephSalerno
 * @author BrendanOlski
 * @author MitchellThomas
 * Class: Octagon.java
 * Project: 3
 */
public class Octagon extends StraightLineShape{

	// Class variables
	public static final String DEFAULT_COLOR = "Black";
	public static final int DEFAULT_WIDTH = 1;
	public static final int DEFAULT_HEIGHT = 2;
	public static final int DEFAULT_POSITION = 0;
	public static final boolean DEFAULT_FILL = false;
	
	//instance variables
	private int[] xCoords = new int[8];
	private int[] yCoords = new int[8]; 
	private int width;
	private int height;
	
	/**
	 * Constructor to create a Octagon given a width, height, color, fill, and position x and y,
	 * additionally calculating the coordinate locations of the shape.
	 * @param width - integer width for the sides of the shape
	 * @param height - integer height for the sides of the shape
	 * @param color - A string representing the color of the shape
	 * @param x - the x coordinate of the shape
	 * @param y - the y coordinate of the shape
	 * @param filled - boolean representing if the shape is filled or not
	 *
	 */
	public Octagon(String color, int x, int y, int width, int height, boolean filled) {
		this.color = color;      
		this.x = x;      
		this.y = y;   
		this.width = width;
		this.height = height;
		this.filled = filled;
		this.calculateCoords();
		
	}

	/**
	 * Constructor to create a Rectangle with no givens, only DEFAULTS,
	 * calculates coords with DEFAUlTS.
	 */
	public Octagon() {
		
		this(DEFAULT_COLOR, DEFAULT_POSITION, DEFAULT_POSITION, DEFAULT_WIDTH, DEFAULT_HEIGHT, DEFAULT_FILL);
		this.calculateCoords();
	}
	
	/**
	 * Returns the width of the Shape
	 * @return the integer width of the Shape
	 */
	public int getWidth() {
		return width;
	}
	
	/**
	 * Returns the height of the Shape
	 * @return the integer height of the Shape
	 */
	public int getHeight() {
		return height;
	}
	
	/**
	 * Returns the int[] of xCoords of the Shape
	 * @return integer array containing the x coordinates
	 */
	public int[] getXCoordinates()
	{
		return xCoords;
	}
	
	/**
	 * Returns the int[] of yCoords of the Shape
	 * @return integer array containing the y coordinates
	 */
	public int[] getYCoordinates()
	{
		return yCoords;
	}
	
	/**
	 * Sets the width to a new value, update coords
	 * @param newWidth - new width of the Shape
	 */
	public void setWidth(int newWidth) {
		this.width = newWidth;
		this.calculateCoords();
	}
	
	/**
	 * Sets the height to a new value, update coords
	 * @param newHeight - new height of the Shape
	 */
	public void setHeight(int newHeight) {
		this.height = newHeight;
		this.calculateCoords();
	}
	
	
	/**
	 * Sets the x position to a new value, update coords
	 * @param newX - new x position of the Shape
	 */
	public void setX(int newX) {
		this.x = newX;
		this.calculateCoords();
	}
	
	
	/**
	 * Sets the y position to a new value, update coords
	 * @param newY - new y position of the Shape
	 */
	public void setY(int newY) {
		this.y = newY;
		this.calculateCoords();
	}

	/**
	 * Sets the coordinates in the arrays xCoords and yCoords
	 */
	public void calculateCoords() {
		
		xCoords[0] = (int)(x + (1/3.0 * width));
		xCoords[1] = (int)(x + (2/3.0 * width));
		xCoords[2] = x + width;
		xCoords[3] = x + width;
		xCoords[4] = (int)(x + (2/3.0 * width));
		xCoords[5] = (int)(x + (1/3.0 * width));
		xCoords[6] = x;
		xCoords[7] = x;
		
		yCoords[0] = y;
		yCoords[1] = y;
		yCoords[2] = (int)(y + (1/3.0 * height));
		yCoords[3] = (int)(y + (2/3.0 * height));
		yCoords[4] = y+height;
		yCoords[5] = y+height;
		yCoords[6] = (int)(y + (2/3.0 * height));
		yCoords[7] = (int)(y + (1/3.0 * height));
	}
	
	
	/**
	 * Returns a double[] with the sides of the Shape
	 * @return a double array with all 8 sides of the Shape
	 */
	public double[] getSides() {
		double[] sides = new double[8];
		double hypotenuse = Math.sqrt(Math.pow((1/3.0 * width), 2) + Math.pow((1/3.0 * height), 2));
		sides[0] = sides[4] = (1/3.0 * width);
		sides[1] = sides[3] = sides[5] = sides[7] = hypotenuse;
		sides[2] = sides[6] = (1/3.0 * height);
		
		return sides;
	}
	
	
	/**
	 * Returns the perimeter of the Shape
	 * @return the perimeter as a double
	 */
	public double getPerimeter() {
		//initialize variables
		double[] sides = this.getSides();
		double perimeter = 0;
		for (int i = 0; i < sides.length; i++)
		{
			perimeter += sides[i];
		}
		return perimeter;
	}
	
	/*
    	* Method to test the equality of two shapes.
    	* @param Object other - a different shape object 
    	* @return true/false depending on equality of shape objects
    	*/   
    	public boolean equalsTo(Object other) {
        	if (this == other) {
        		return true;
        	} else if (! (other instanceof Octagon)) {
            		return false;
        	} else {
            		Octagon oc2 = (Octagon) other;
            		return (this.filled == oc2.filled && this.color == oc2.color && this.x == oc2.x && this.y == oc2.y && this.width == oc2.width && this.height == oc2.height);
        	}
    	}
	
	/**
	 * Returns the string representation of the Shape
	 * @return a string representing the Shape
	 */
	public String toString() {
		String str = "===Octagon===\n";
		str += "Height: " + height + "\n";
		str += "Width: " + width + "\n"; 
		str += "Coordinates: ";

	    for(int index = 0; index<xCoords.length; ++index)
	      {
	    	  str+= "(" + xCoords[index] + "," + yCoords[index] + "), ";
	      }
	      
		str += "\nPosition: " + x + "," + y + "\n";
		str += "Color: " + color + "\n";
	    str += "Filled: " + filled + "\n";
	    
	    double[] sides = getSides();
	    for(int x = 0; x<sides.length; x++)
	      {
	    	  str += "Side " + (x + 1) + ": " + sides[x] + "\n";
	      }
	    str += "\nPerimeter: " + getPerimeter() + "\n";
	    str += "\n==========\n";
	    return str;
	    
	}
	   
}
