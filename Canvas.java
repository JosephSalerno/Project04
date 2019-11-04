/**
 * A <code>Canvas</code> class 
 * @author JosephSalerno
 * @author BrendanOlski
 * @author MitchellThomas
 * Class: Canvas.java
 * Project: 4
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Canvas extends JPanel implements MouseListener,
                                              MouseMotionListener {

   //Point mouseLocation;
   //Point clickLocation;
   
   Point startLocation;
   Point endLocation;

   public Canvas() {
      super();
      
      addMouseListener(this);
      addMouseMotionListener(this);
   }
   
   @Override
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
      
      Graphics2D painterG = (Graphics2D) g;
      
      if (startLocation != null) {
         painterG.setColor(Color.GREEN);
         int width = Math.abs(endLocation.x - startLocation.x);
         int height = Math.abs(endLocation.y - startLocation.y);
         int left = Math.min(startLocation.x, endLocation.x);
         int top = Math.min(startLocation.y, endLocation.y);
         painterG.drawRect(left, top, width, height);
      }
      
      //if (mouseLocation != null) {
      //   painterG.setColor(Color.BLUE);
      //   painterG.fillOval(mouseLocation.x, mouseLocation.y, 50, 50);
      //}
      //if (clickLocation != null) {
      //   painterG.setColor(Color.RED);
      //   painterG.fillRect(clickLocation.x, clickLocation.y, 50, 50);
      //}
   }
   
   public void mouseClicked(MouseEvent e) {
      //clickLocation = e.getPoint();
      //repaint();
      //
   }
   
   public void mouseEntered(MouseEvent e) {
      
   }
   
   public void mouseExited(MouseEvent e) {
      
   }
   
   public void mousePressed(MouseEvent e) {
      startLocation = e.getPoint();
      endLocation = e.getPoint();
      
      repaint();
   }
   
   public void mouseReleased(MouseEvent e) {
      
   }
   
   public void mouseDragged(MouseEvent e) {
      endLocation = e.getPoint();
      repaint();
      
   }
   
   public void mouseMoved(MouseEvent e) {
      //mouseLocation = e.getPoint();
      //repaint();
   }


}
