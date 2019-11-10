import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.JPanel;
import java.awt.event.*;
import shapes.*;
import java.util.Iterator;

/**
 * A <code>Canvas</code> class that sets the color and fill of the shape
 * and allows the user to drag the mouse to create a new shape
 * Also sticks the shape to the display when the mouse is released.
 * @author JosephSalerno
 * @author BrendanOlski
 * @author MitchellThomas
 * Class: Canvas.java
 * Project: 4
 */

public class Canvas extends JPanel implements MouseListener, MouseMotionListener {
   
   // Variables
   private Point posStart;
   private Point posEnd;   
   private java.awt.Rectangle drawRect;
   public boolean isFilled;
   public String newColor;
   public String shapeToDraw;
   private AllShapes drawnShape;
   private ShapeHolder holder = ShapeHolder.getInstance();

   
   /**
    * Constructor method that establishes default settings for shape and 
    * background color, and adds listeners.
    */
	
   public Canvas() {
      super();
      this.setOpaque(true);
      this.setBackground(Color.WHITE);
      

      drawRect = null;
      

      addMouseListener(this);      
      addMouseMotionListener(this);
      
      
   }
   
   /**
    * Sets the color of the shape based on which shape and color buttons have been pressed, 
    * and draws the shape from shapeholder as well as drawing the shape with its outlining rectangle
    * as the mouse is dragged
    */
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
      
      //retrieve shapeholder iterator
      Iterator<AllShapes> iter = holder.iterator();

      while (iter.hasNext())
      {
    	  //retrieve shape
    	  AllShapes current = iter.next();
    	  
    	  //change color of shape
    	  changeColor(current.getColor(), g);

    	  //checks what shape is being retrieved
    	  if (current instanceof Circle)
    	  {
    		  drawCircle((Circle)current, g);
    	  }
    	  else if (current instanceof Oval)
    	  {
    		  drawOval((Oval)current, g);
    	  
    	  }
    	  else if (current instanceof Square)
    	  {
    		  drawSquare((Square)current, g);
    	  }
    	  else if (current instanceof Octagon)
    	  {
    		  drawOctagon((Octagon)current, g);
    	  }
    	  else if (current instanceof Triangle)
    	  {
    		  drawTriangle((Triangle)current, g);
    	  }
    	  else if (current instanceof Rectangle)
    	  {
    		  drawRectangle((Rectangle)current, g);  
    	  }
      }
      
      /*
       * Checks to see if the rectangle is there, and draws both
       * the rectangle and the current shape inside the
       * rectangle if it is.
       * 
       */
	   
      if (drawRect != null) {
    	 g.setColor(new Color(0,0,0));
         g.drawRect((int)drawRect.getX(), (int)drawRect.getY(),
                    (int)drawRect.getWidth(), (int)drawRect.getHeight());
         
         
         //======Change Color=======//
         changeColor(newColor, g);
         
         //=====SHAPES======//
         
         
         //=====CIRCLE======//
         //what shape needs to be drawn//
         if(shapeToDraw.equals("circle"))
         {
        
         Circle circ = new Circle(Math.min((int)drawRect.getWidth(), (int)drawRect.getHeight()), 
        		 newColor, (int)drawRect.getX(), (int)drawRect.getY(), isFilled);
         drawnShape = circ;
         drawCircle(circ, g);
         }
         
       //=====OVAL======//
         
         else if(shapeToDraw.equals("oval"))
         {
        	 
         Oval o = new Oval((int)drawRect.getWidth(), (int)drawRect.getHeight(),
        		 newColor, (int)drawRect.getX(), (int)drawRect.getY(), isFilled);
         drawnShape = o;
         drawOval(o, g);
         }
         
       //=====SQUARE======//
         else if(shapeToDraw.equals("square"))
         {
        	
         Square s  = new Square(Math.min((int)drawRect.getWidth(), (int)drawRect.getHeight()), 
        		 newColor, (int)drawRect.getX(), (int)drawRect.getY(), isFilled);
         drawnShape = s;
         drawSquare(s, g);
         }
         
       //=====RECTANGLE======//
         else if(shapeToDraw.equals("rectangle"))
         {
        	Rectangle r = new Rectangle(newColor, (int)drawRect.getX(), (int)drawRect.getY(), 
        			 (int)drawRect.getWidth(), (int)drawRect.getHeight(), isFilled); 
        	drawnShape = r;
        	drawRectangle(r, g);
         }
         
       //=====OCTAGON======//
         else if(shapeToDraw.equals("octagon"))
         {
        	 
        	 Octagon oct  = new Octagon(newColor, (int)drawRect.getX(), (int)drawRect.getY(),
        			 (int)drawRect.getWidth(), (int)drawRect.getHeight(), isFilled);
        	 drawnShape = oct;
             drawOctagon(oct, g);
             }
             
         
         
       //=====TRIANGLE======//
         else if(shapeToDraw.equals("triangle"))
         {
        	 
        	 Triangle t  = new Triangle((int)drawRect.getWidth(), (int)drawRect.getHeight(),
        			 newColor, (int)drawRect.getX(), (int)drawRect.getY(), isFilled);
        	 drawnShape = t;
             drawTriangle(t, g);
         }
      }
      
   }
   
   

   @Override
   public void mouseEntered(MouseEvent e) {
   }

   @Override
   public void mouseExited(MouseEvent e) {
   }
   
   @Override
   public void mouseMoved(MouseEvent e) {
      
      
   }
   
   /**
    * Tells the program what to do when the user presses down on the mouse.
    */
   public void mousePressed(MouseEvent e) {
      if (e.getButton() == MouseEvent.BUTTON1) {
         posStart = new Point(e.getX(), e.getY());
         posEnd = new Point(e.getX(), e.getY());
         updateRectangle();
         
        
      }
   }
	
   /**
    * Tells the program what to do when the user releases the mouse.
    */
   public void mouseReleased(MouseEvent e) {
      if (e.getButton() == MouseEvent.BUTTON1) {
         posEnd.setLocation(e.getX(), e.getY());
         updateRectangle();
         
         // Add the shape to the shapeholder here
         holder.addShape(drawnShape);
         
         // Free up the draw variables
         drawRect = null;
         posStart = null;
         posEnd = null;
         
      }
      
   }
   
   /**
    * Tells the program what to do when the user drags the mouse.
    */
   public void mouseDragged(MouseEvent e) {
      if (drawRect != null) {
         posEnd.setLocation(e.getX(), e.getY());
         updateRectangle();
      }
   }



   /**
    * Tells the program what to do when the user clicks the mouse.
    */
   public void mouseClicked(MouseEvent e) {
	 //clickLocation = e.getPoint();
	 updateRectangle();
      
   }
   
   /**
    * Updates the rectangle based on the first and 
    * current mouse positions.
    */
public void updateRectangle() {
      
      if (drawRect == null) {
         drawRect = new java.awt.Rectangle(0, 0, 0, 0);
      }
      int width = (int)Math.abs(posEnd.getX() - posStart.getX());
      int height = (int)Math.abs(posEnd.getY() - posStart.getY());
      int left = (int)Math.min(posStart.getX(), posEnd.getX());
      int top = (int)Math.min(posStart.getY(), posEnd.getY());
      
    
     
      drawRect.setLocation(left, top);
      
      drawRect.setSize(width, height);
      

      repaint();
   }
/**
* Method changes the color of the canvas
* @param c - represents the color being changed to
* @param g - graphics of the given canvas
*/
   public void changeColor(String c, Graphics g)
   {
	   if(c.equals("red"))
       {
      	 g.setColor(new Color(255,0,0));
       }
       else if(c.equals("green")){
      	 g.setColor(new Color(0,255,0));
       }
       else if(c.equals("blue"))
       {
      	 g.setColor(new Color(0,0,255));
       }
       else if(c.equals("purple"))
       {
      	 g.setColor(new Color(255,0,255));
       }
       else if(c.equals("orange"))
       {
      	 g.setColor(new Color(255,128,0));
       }
       else if(c.equals("yellow"))
       {
      	 g.setColor(new Color(255,255,0));
       }
   }
   
   /**
   * Draws a circle
   * @param c - represents a circle that needs to be drawn
   * @param g - graphics of the given canvas
   */
   public void drawCircle(Circle c, Graphics g)
   {
	   g.drawOval(c.getX(), c.getY(), c.getRadius(), c.getRadius());
	   
		  if(c.isFilled()) 
			  g.fillOval(c.getX(), c.getY(), c.getRadius(), c.getRadius()); 
   }
   
   /**
    * Draws an oval
    * @param o - represents a oval that needs to be drawn
    * @param g - graphics of the given canvas
    */
   public void drawOval(Oval o, Graphics g)
   {
	   g.drawOval(o.getX(), o.getY(), o.getRadius(), o.getHeight());
	   
		  if(o.isFilled()) 
			  g.fillOval(o.getX(), o.getY(), o.getRadius(), o.getHeight());
   }
   
   /**
    * Draws a square
    * @param s - represents a square that needs to be drawn
    * @param g - graphics of the given canvas
    */
   public void drawSquare(Square s, Graphics g)
   {
	   g.drawPolygon(s.getXCoordinates(), s.getYCoordinates(), 4);
	   
	         if(s.isFilled())
	       		g.fillPolygon(s.getXCoordinates(), s.getYCoordinates(), 4);
   }
   
   /**
    * Draws a rectangle
    * @param r - represents a rectangle that needs to be drawn
    * @param g - graphics of the given canvas
    */
   public void drawRectangle(Rectangle r, Graphics g)
   {
	   g.drawPolygon(r.getXCoordinates(), r.getYCoordinates(), 4);
	   
       if(r.isFilled())
     		g.fillPolygon(r.getXCoordinates(), r.getYCoordinates(), 4);
   }
   
   /**
    * Draws an octagon
    * @param o - represents an octagon that needs to be drawn
    * @param g - graphics of the given canvas
    */
   public void drawOctagon(Octagon o, Graphics g)
   {
	   g.drawPolygon(o.getXCoordinates(), o.getYCoordinates(), 8);
	   
       if(o.isFilled())
     		g.fillPolygon(o.getXCoordinates(), o.getYCoordinates(), 8);
   }
   
   /**
    * Draws a triangle
    * @param t - represents a triangle that needs to be drawn
    * @param g - graphics of the given canvas
    */
   public void drawTriangle(Triangle t, Graphics g)
   {
	   g.drawPolygon(t.getXCoordinates(), t.getYCoordinates(), 3);
	   
       if(t.isFilled())
     		g.fillPolygon(t.getXCoordinates(), t.getYCoordinates(), 3);
   }
   
		  
   

}
