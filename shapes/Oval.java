package shapes;

/**
 * A <code>Oval</code> object represents a Oval with
 * a width, height, color, (x,y) position, and boolean filled
 * @author JosephSalerno
 * @author BrendanOlski
 * @author MitchellThomas
 * Class: Oval.java
 * Project: 3
 */
public class Oval extends RoundShape{
	
	
	//class variables
	public static final String DEFAULT_COLOR = "Black";
	public static final int DEFAULT_POSITION = 0;
	public static final int DEFAULT_RADIUS = 1;
	public static final int DEFAULT_HEIGHT = 2;
	public static final boolean DEFAULT_FILL = false;
	
	//instance variables
	private int height;

	/**
	 * Constructor to create a Oval given a width, height, color, position x, y, and fill.
	 * @param radius - integer radius for the Oval
	 * @param height - integer height for the Oval
	 * @param color - A string representing the color of the shape
	 * @param x - the x coordinate of the shape
	 * @param y - the y coordinate of the shape
	 * @param filled - boolean representing if the shape is filled or not
	 *
	 */
	public Oval(int radius, int height, String color, int x, int y, boolean filled)
	{
		this.radius = radius;
		this.height = height;
	    this.color = color;
	    this.x = x;
	    this.y = y;
	    this.filled = filled;
	}
	
	/**
	 * Constructor to create a Oval no givens, only DEFAULTS
	 */
	public Oval() {
		this(DEFAULT_RADIUS, DEFAULT_HEIGHT, DEFAULT_COLOR, DEFAULT_POSITION, DEFAULT_POSITION, DEFAULT_FILL);
	   }
	
	/**
	 * Returns the integer height of the Oval
	 * @return height of the Oval
	 */
	public int getHeight()
	{
		return height;
	}
	
	/**
	 * Sets height of the Oval to a new one
	 * @param newHeight - new height of the Oval
	 */
	public void setHeight(int newHeight)
	{
		this.height = newHeight;
	}
	
	/**
	 * Sets x position of the Oval to a new one
	 * @param newX - new x position of the Oval
	 */
	public void setX(int newX)
	{
		this.x = newX;
	}
	
	/**
	 * Sets y of the Oval to a new one
	 * @param newY - new y position of the Oval
	 */
	public void setY(int newY)
	{
		this.y = newY;
	}

	/**
	 * Returns the string representation of the Oval
	 * @return the Oval's string representation
	 */
	public String toString() {
	      String str = "===Oval===\n";
	      str += "Radius (Width): " + radius + "\n";
	      str += "Radius (Height): " + height + "\n";
	      str += "Position: " + x + "," + y + "\n";
	      str += "Color: " + color + "\n";
	      str += "Filled: " + filled;
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
        	} else if (! (other instanceof Oval)) {
            		return false;
        	} else {
            		Oval o2 = (Oval) other;
            		return (this.filled == o2.filled && this.color == o2.color && this.height == o2.height && this.radius == o2.radius && this.x == o2.x && this.y == o2.y);
        	}
    	}
	      
	
}
