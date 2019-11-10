package shapes;

/**
 * A <code>AllShapes</code> abstract class that creates methods
 * to work with each shape in Project 3.
 * @author JosephSalerno
 * @author BrendanOlski
 * @author MitchellThomas
 * Class: AllShapes.java
 * Project: 3
 */

public abstract class AllShapes {
	
	protected int x;
	protected int y;
	protected String color;
	protected boolean filled;

    /**
	 * Returns the string color of the Circle
	 * @return color of the Circle
	 */
	public String getColor()
	{
		return color;
	}

    /**
	 * Returns the x position of the Oval
	 * @return x position of the Oval
	 */
	public int getX()
	{
		return x;
	}
	
	/**
	 * Returns the y position of the Oval
	 * @return y position of the Oval
	 */
	public int getY()
	{
		return y;
	}

	/**
	 * Sets the Circle color to a new color
	 * @param newColor - new color string of the Circle
	 */
	public void setColor(String newColor)
	{
		this.color = newColor;
	}
	
	/**
	 * Checks if the shape is filled
	 * @return a boolean relating to whether or not the shape is filled
	 */
	public boolean isFilled()
	{
		return filled;
	}
	
	/**
	 * Sets filled to a new value
	 * @param newFill - new boolean value for filled
	 */
	public void setFill(boolean newFill)
	{
		this.filled = newFill;
	}

	/*
    * Method to test the equality of two shapes.
    * @param Object other - a different shape object 
    * @return true/false depending on equality of shape objects
    */   
	public boolean equalsTo(Object other)
	{
		if(this == other)
			return true;
		else if(!(other.getClass() == this.getClass()))
			return false;
		else{
			AllShapes s = (AllShapes)other;
			return (s.getX() == this.getX() && s.getY() == this.getY() && s.isFilled() == this.isFilled() && s.getColor().equals(this.getX()));
		}
	}
	
	/**
	 * Sets x position of the Shape to a new one
	 * @param newX - new x position of the Shape
	 */
	public abstract void setX(int newX);

	/**
	 * Sets y of the Shape to a new one
	 * @param newY - new y position of the Shape
	 */
	public abstract void setY(int newY);

    /**
	 * Returns the string representation of the Shape
	 * @return a string representing the Shape
	 */
    public abstract String toString();
}
