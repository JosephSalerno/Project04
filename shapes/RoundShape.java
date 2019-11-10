package shapes;
/**
 * A <code>RoundShape</code> abstract class that creates methods
 * to work with each round shape in Project 3.
 * @author JosephSalerno
 * @author BrendanOlski
 * @author MitchellThomas
 * Class: RoundShape.java
 * Project: 3
 */

public abstract class RoundShape extends AllShapes{
  
  	protected int radius;

         /**
	 * Returns the integer width of the Shape
	 * @return width of the Shape
	 */
	public int getRadius()
	{
		return radius;
	}
	
	/**
	 * Sets radius of the Shape to a new one
	 * @param newRadius - new radius of the Shape
	 */
	public void setRadius(int newRadius)
	{
		this.radius = newRadius;
	}
  
  }
