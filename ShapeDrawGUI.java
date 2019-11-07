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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ShapeDrawGUI extends JFrame implements ActionListener {
    
   // Class Variables  
   private Canvas canvas;
   
   private static String color = "white";
   private static int numShape;
   private static boolean filled;
   
   //shapes
   private JButton circleButton;
   private JButton squareButton;
   private JButton triangleButton;
   private JButton octagonButton;
   private JButton rectangleButton;
   private JButton ovalButton;
   
   //colors
   private JButton redButton;
   private JButton greenButton;
   private JButton blueButton;
   private JButton yellowButton;
   private JButton orangeButton;
   private JButton purpleButton;
   
   //checkbox
   private JCheckBox filledCheckBox;
   
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
      
      //=====CIRCLE=====
      circleButton = new JButton("Circle");
      
      // Use "this" class to handle button presses
      circleButton.addActionListener(this);
      positionConst.gridx = 0;
      positionConst.gridy = 2;
      positionConst.insets = new Insets(10, 10, 10, 10);
      add(circleButton, positionConst);
 
   	//=====SQUARE=====
   	squareButton = new JButton("Square");
   
   // Use "this" class to handle button presses
   	squareButton.addActionListener(this);
   	positionConst.gridx = 1;
   	positionConst.gridy = 2;
   	positionConst.insets = new Insets(10, 10, 10, 10);
   	add(squareButton, positionConst);
   	
  //=====RECTANGLE=====
   	rectangleButton = new JButton("Rectangle");
   
   // Use "this" class to handle button presses
   	rectangleButton.addActionListener(this);
   	positionConst.gridx = 2;
   	positionConst.gridy = 2;
   	positionConst.insets = new Insets(10, 10, 10, 10);
   	add(rectangleButton, positionConst);
   	
  //=====OVAL=====
   	ovalButton = new JButton("Oval");
   
   // Use "this" class to handle button presses
   	ovalButton.addActionListener(this);
   	positionConst.gridx = 3;
   	positionConst.gridy = 2;
   	positionConst.insets = new Insets(10, 10, 10, 10);
   	add(ovalButton, positionConst);
   	
   	
  //=====OCTAGON=====
   	octagonButton = new JButton("Octagon");
   
   // Use "this" class to handle button presses
   	octagonButton.addActionListener(this);
   	positionConst.gridx = 4;
   	positionConst.gridy = 2;
   	positionConst.insets = new Insets(10, 10, 10, 10);
   	add(octagonButton, positionConst);
   	
   	
  //=====TRIANGLE=====
   	triangleButton = new JButton("Triangle");
   
   // Use "this" class to handle button presses
   	triangleButton.addActionListener(this);
   	positionConst.gridx = 5;
   	positionConst.gridy = 2;
   	positionConst.insets = new Insets(10, 10, 10, 10);
      add(triangleButton, positionConst);
      
  //=====RED=====
      redButton = new JButton("Red");

   // Use "this" class to handle button presses
      redButton.addActionListener(this);
      positionConst.gridx = 0;
      positionConst.gridy = 3;
      positionConst.insets = new Insets(10, 10, 10, 10);
      add(redButton, positionConst);

   //=====GREEN=====
      greenButton = new JButton("Green");

   // Use "this" class to handle button presses
      greenButton.addActionListener(this);
      positionConst.gridx = 1;
      positionConst.gridy = 3;
      positionConst.insets = new Insets(10, 10, 10, 10);
      add(greenButton, positionConst);

   //=====BLUE=====
   blueButton = new JButton("Blue");

   // Use "this" class to handle button presses
      blueButton.addActionListener(this);
      positionConst.gridx = 2;
      positionConst.gridy = 3;
      positionConst.insets = new Insets(10, 10, 10, 10);
      add(blueButton, positionConst);
	   

   //=====YELLOW=====
   yellowButton = new JButton("Yellow");

   // Use "this" class to handle button presses
      yellowButton.addActionListener(this);
      positionConst.gridx = 3;
      positionConst.gridy = 3;
      positionConst.insets = new Insets(10, 10, 10, 10);
      add(yellowButton, positionConst);
	   
	   
   //=====ORANGE=====
   orangeButton = new JButton("Orange");

   // Use "this" class to handle button presses
      orangeButton.addActionListener(this);
      positionConst.gridx = 4;
      positionConst.gridy = 3;
      positionConst.insets = new Insets(10, 10, 10, 10);
      add(orangeButton, positionConst);
	   
	   
   //=====PURPLE=====
   purpleButton = new JButton("Purple");

   // Use "this" class to handle button presses
      purpleButton.addActionListener(this);
      positionConst.gridx = 5;
      positionConst.gridy = 3;
      positionConst.insets = new Insets(10, 10, 10, 10);
      add(purpleButton, positionConst);
      
      
      
  //=====FILLED=====
      filledCheckBox = new JCheckBox("Filled");

      // Use "this" class to handle button presses
         filledCheckBox.addActionListener(this);
         positionConst.gridx = 6;
         positionConst.gridy = 2;
         positionConst.insets = new Insets(10, 10, 10, 10);
         add(filledCheckBox, positionConst);
         
   
}

   public static void main(String[] args) {
       
      // Main frame
      ShapeDrawGUI appFrame = new ShapeDrawGUI();                
      
      // Show window
      appFrame.setVisible(true);
       
       
   }

@Override
public void actionPerformed(ActionEvent e) {
	//is the shape filled
	this.filled = filledCheckBox.isSelected();
	
	//if buttons are pressed, update values
	if (e.getActionCommand() == "Circle")
		this.numShape = 0;
	else if (e.getActionCommand() == "Oval") 
		this.numShape = 1;
	else if (e.getActionCommand() == "Square")
		this.numShape = 2;
	else if (e.getActionCommand() == "Rectangle")
		this.numShape = 3;
	else if (e.getActionCommand() == "Triangle")
		this.numShape = 4;
	else if (e.getActionCommand() == "Octagon")
		this.numShape = 5;
	else if (e.getActionCommand() == "Red")
		this.color = "red";
	else if (e.getActionCommand() == "Blue")
		this.color = "blue";
	else if (e.getActionCommand() == "Green")
		this.color = "green";
	else if (e.getActionCommand() == "Yellow")
		this.color = "yellow";
	else if (e.getActionCommand() == "Purple")
		this.color = "purple";
	else if (e.getActionCommand() == "Orange")
		this.color = "orange";
	
	//set variables in canvas equal to these new ones
	this.canvas.shapeToDraw = numShape;
	this.canvas.isFilled = filled;
	this.canvas.newColor = color;
	
	//test
//	System.out.println("Num: " + numShape);
//	System.out.println("Color: " +color);
//	System.out.println("Filled?: " + filled);
	

}


}
