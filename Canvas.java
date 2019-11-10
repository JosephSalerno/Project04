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
 * and uses the coordinates of the mouse to determine the shape's size. 
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
  
   

   final private Color colorSelect = new Color(0, 0, 0);
   
   /*
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
   
   /*
    * Sets the color of the shape based on which shape and color buttons have been pressed, 
    * and checks the instance of current.
    */
	
   @Override
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.setColor(new Color(0,0,0));
      Iterator<AllShapes> iter = holder.iterator();

      while (iter.hasNext())
      {
    	  AllShapes current = iter.next();
    	  

    	  if(current.getColor() == "red")
          {
         	 g.setColor(new Color(255,0,0));
          }
          else if(current.getColor() == "green"){
         	 g.setColor(new Color(0,255,0));
          }
          else if(current.getColor() == "blue")
          {
         	 g.setColor(new Color(0,0,255));
          }
          else if(current.getColor() == "purple")
          {
         	 g.setColor(new Color(255,0,255));
          }
          else if(current.getColor() == "orange")
          {
         	 g.setColor(new Color(255,128,0));
          }
          else if(current.getColor() == "yellow")
          {
         	 g.setColor(new Color(255,255,0));
          }
          

    	  if (current instanceof Circle)
    	  {
    		  g.drawOval(current.getX(), current.getY(), 
    				  ((Circle) current).getRadius(), ((Circle) current).getRadius());
    		  if(current.isFilled()) {
    			  g.fillOval(current.getX(), current.getY(),
    					  ((Circle) current).getRadius(), ((Circle) current).getRadius());
    		  }
    	  }
    	  else if (current instanceof Oval)
    	  {
    		  g.drawOval(current.getX(), current.getY(), 
    				  ((Oval) current).getRadius(), ((Oval) current).getHeight());
    		  if(current.isFilled()) {
    			  g.fillOval(current.getX(), current.getY(),
    					  ((Oval) current).getRadius(), ((Oval) current).getHeight());
    	  }
    	  }
    	  else if (current instanceof Square)
    	  {
    		  g.drawPolygon(((Square) current).getXCoordinates(), 
    				  ((Square) current).getYCoordinates(), 4);
    	         if(current.isFilled())
    	       		g.fillPolygon(((Square) current).getXCoordinates(), 
    	       				((Square) current).getYCoordinates(), 4);
    	  }
    	  else if (current instanceof Octagon)
    	  {
    		  g.drawPolygon(((Octagon) current).getXCoordinates(), 
    				  ((Octagon) current).getYCoordinates(), 8);
    	         if(current.isFilled())
    	       		g.fillPolygon(((Octagon) current).getXCoordinates(), 
    	       				((Octagon) current).getYCoordinates(), 8);
    	  }
    	  else if (current instanceof Triangle)
    	  {
    		  g.drawPolygon(((Triangle) current).getXCoordinates(), 
    				  ((Triangle) current).getYCoordinates(), 3);
    	         if(current.isFilled())
    	       		g.fillPolygon(((Triangle) current).getXCoordinates(), 
    	       				((Triangle) current).getYCoordinates(), 3);
    	  }
    	  else if (current instanceof Rectangle)
    	  {
    		  g.drawPolygon(((Rectangle) current).getXCoordinates(), 
    				  ((Rectangle) current).getYCoordinates(), 4);
    	         if(current.isFilled())
    	       		g.fillPolygon(((Rectangle) current).getXCoordinates(), 
    	       				((Rectangle) current).getYCoordinates(), 4);  
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
         
         
         //======COLORS=======//
         if(newColor == "red")
         {
        	 g.setColor(new Color(255,0,0));
         }
         else if(newColor == "green")
         {
        	 g.setColor(new Color(0,255,0));
         }
         else if(newColor == "blue")
         {
        	 g.setColor(new Color(0,0,255));
         }
         else if(newColor == "purple")
         {
        	 g.setColor(new Color(255,0,255));
         }
         else if(newColor == "orange")
         {
        	 g.setColor(new Color(255,128,0));
         }
         else if(newColor == "yellow")
         {
        	 g.setColor(new Color(255,255,0));
         }
         
         //=====SHAPES======//
         
         
         //=====CIRCLE======//
         if(shapeToDraw.equals("circle"))
         {
        
         Circle circ = new Circle(Math.min((int)drawRect.getWidth(), (int)drawRect.getHeight()), 
        		 newColor, (int)drawRect.getX(), (int)drawRect.getY(), isFilled);
         drawnShape = circ;
         
         g.drawOval(circ.getX(), circ.getY(), circ.getRadius(), circ.getRadius());
         	if(isFilled)
         		g.fillOval(circ.getX(), circ.getY(), circ.getRadius(), circ.getRadius());
         }
         
       //=====OVAL======//
         
         else if(shapeToDraw.equals("oval"))
         {
        	 
         Oval o = new Oval((int)drawRect.getWidth(), (int)drawRect.getHeight(),
        		 newColor, (int)drawRect.getX(), (int)drawRect.getY(), isFilled);
         drawnShape = o;
         
         g.drawOval(o.getX(), o.getY(), o.getRadius(), o.getHeight());
         if(isFilled)
      		g.fillOval(o.getX(), o.getY(), o.getRadius(), o.getHeight());
         }
         
       //=====SQUARE======//
         else if(shapeToDraw.equals("square"))
         {
        	
         Square s  = new Square(Math.min((int)drawRect.getWidth(), (int)drawRect.getHeight()), 
        		 newColor, (int)drawRect.getX(), (int)drawRect.getY(), isFilled);
         drawnShape = s;
         
         g.drawPolygon(s.getXCoordinates(), s.getYCoordinates(), 4);
         if(isFilled)
       		g.fillPolygon(s.getXCoordinates(), s.getYCoordinates(), 4);
         }
         
       //=====RECTANGLE======//
         else if(shapeToDraw.equals("rectangle"))
         {
        	Rectangle r = new Rectangle(newColor, (int)drawRect.getX(), (int)drawRect.getY(), 
        			 (int)drawRect.getWidth(), (int)drawRect.getHeight(), isFilled); 
        	drawnShape = r;
        	
        	g.drawRect((int)drawRect.getX(), (int)drawRect.getY(),
                    (int)drawRect.getWidth(), (int)drawRect.getHeight());
             
             if(isFilled)
             {
            	 g.fillRect((int)drawRect.getX(), (int)drawRect.getY(),
                         (int)drawRect.getWidth(), (int)drawRect.getHeight());
             }
         }
         
       //=====OCTAGON======//
         else if(shapeToDraw.equals("octagon"))
         {
        	 
        	 Octagon oct  = new Octagon(newColor, (int)drawRect.getX(), (int)drawRect.getY(),
        			 (int)drawRect.getWidth(), (int)drawRect.getHeight(), isFilled);
        	 drawnShape = oct;
             g.drawPolygon(oct.getXCoordinates(), oct.getYCoordinates(), 8);
             
             
             if(isFilled)
           		g.fillPolygon(oct.getXCoordinates(), oct.getYCoordinates(), 8);
             }
             
         
         
       //=====TRIANGLE======//
         else if(shapeToDraw.equals("triangle"))
         {
        	 
        	 Triangle t  = new Triangle((int)drawRect.getWidth(), (int)drawRect.getHeight(),
        			 newColor, (int)drawRect.getX(), (int)drawRect.getY(), isFilled);
        	 drawnShape = t;
             g.drawPolygon(t.getXCoordinates(), t.getYCoordinates(), 3);
             
             if(isFilled)
           		g.fillPolygon(t.getXCoordinates(), t.getYCoordinates(), 3);
         
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
   
   /*
    * Tells the program what to do when the user presses down on the mouse.
    */
	
   @Override
   public void mousePressed(MouseEvent e) {
      if (e.getButton() == MouseEvent.BUTTON1) {
         posStart = new Point(e.getX(), e.getY());
         posEnd = new Point(e.getX(), e.getY());
         

         
         updateRectangle();
         
        
      }
   }
	
   /*
    * Tells the program what to do when the user releases the mouse.
    */
	
   @Override
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
   
   /* 
    * Tells the program what to do when the user drags the mouse.
    */
	
   @Override
   public void mouseDragged(MouseEvent e) {
      if (drawRect != null) {
         posEnd.setLocation(e.getX(), e.getY());
         updateRectangle();
      }
   }



   /*
    * Tells the program what to do when the user clicks the mouse.
    */
	
   @Override
   public void mouseClicked(MouseEvent e) {
	 //clickLocation = e.getPoint();
	 updateRectangle();
      
   }
   
   /*
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

   
}
