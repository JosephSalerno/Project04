/**
 * A <code>ShapeDrawGUI</code> class 
 * @author JosephSalerno
 * @author BrendanOlski
 * @author MitchellThomas
 * Class: ShapeDrawGUI.java
 * Project: 4
 */

import javax.swing.*;
import java.awt.*;



public class ShapeDrawGUI extends JFrame {
    
   // Class Variables  
   private Canvas canvas;
      
   public ShapeDrawGUI() {
      
      // Use a GridBagLayout
      setLayout(new GridBagLayout());
      GridBagConstraints positionConst = new GridBagConstraints();
      positionConst.insets = new Insets(10, 10, 10, 10);
      
      // Set up the window
      setSize(1100,800);        
      setTitle("Draw Shapes");        
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // Add the canvas
      positionConst.gridx = 0;
      positionConst.gridy = 0;
      positionConst.fill = GridBagConstraints.BOTH;
      positionConst.gridwidth = GridBagConstraints.REMAINDER;
      positionConst.weightx = 1;
      positionConst.weighty = 1;
      
      canvas = new Canvas();        
      add(canvas, positionConst);
      
      positionConst.fill = GridBagConstraints.HORIZONTAL;
      positionConst.gridwidth = 1;
      positionConst.gridy = 1;
      positionConst.weighty = 0;
      
      // Add buttons and checkboxes below the canvas here
      JButton squareButton = new Button("Square");
      squareButton.addActionListener(this);
      JButton circleButton = new Button("Circle");
      circleButton.addActionListener(this);
      JButton triangleButton = new Button("Triangle");
      triangleButton.addActionListener(this);
      JButton octagonButton = new Button("Octagon");
      octagonButton.addActionListener(this);
       
      
      
      
   }
   
   public static void main(String[] args) {
       
      // Main frame
      ShapeDrawGUI appFrame = new ShapeDrawGUI();                
      
      // Show window
      appFrame.setVisible(true);
       
       
   }
}
