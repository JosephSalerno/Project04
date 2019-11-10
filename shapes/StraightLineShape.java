package shapes;
/**
 * A <code>StraightLineShape</code> abstract class that creates methods
 * to work with each straight line shape in Project 3.
 * 
 * @author JosephSalerno
 * @author BrendanOlski
 * @author MitchellThomas 
 * Class: StraightLineShape.java 
 * Project: 3
 */

public abstract class StraightLineShape extends AllShapes{

    /**
	 * Returns the perimeter of the Shape
	 * @return the perimeter as a double
	 */
    public abstract double getPerimeter();
	
	/**
	 * Returns a double[] with the sides of the shape
	 * @return a double array with all sides of the shape
	 */
	public abstract double[] getSides();

	/**
	 * Sets the coordinates in the arrays xCoords and yCoords
	 */
	public abstract void calculateCoords();

  }
