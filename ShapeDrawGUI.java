/**
 * A <code>ShapeDrawGUI</code> class that sets the dimensions and buttons
 * of the GUI window. Also updates the states of the current shape, current 
 * color, and whether or not the shape is filled, and tells the GUI
 * to draw this shape.
 * 
 * 
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
   
   private static String colorSelected = "white";
   private static String shapeSelected;
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
   
   /**
    * Sets the layout of the GUI window, as well as the buttons and 
    * the check box using ActionListeners.
    */
   
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
      
      // Add buttons and check boxes below the canvas here
      
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

   


/**
 * @param e specifies the action the user has completed
 * by pressing a specific button.
 * This method tells the GUI which shape and color to draw once the user 
 * has chosen a certain shape by clicking a combination of buttons,
 * and whether or not the shape is filled. It also sets the state variables
 * in Canvas equal to the new assigned values, and has a tester that outputs
 * text to confirm that the variables have been updated correctly.
 *
 */ 
   
public void actionPerformed(ActionEvent e) {
	//is the shape filled
	this.filled = filledCheckBox.isSelected();
	
	//if buttons are pressed, update values
	if (e.getActionCommand() == "Circle") {
		this.shapeSelected = "circle";
	}
	else if (e.getActionCommand() == "Oval") 
		this.shapeSelected = "oval";
	else if (e.getActionCommand() == "Square")
		this.shapeSelected = "square";
	else if (e.getActionCommand() == "Rectangle")
		this.shapeSelected = "rectangle";
	else if (e.getActionCommand() == "Triangle")
		this.shapeSelected = "triangle";
	else if (e.getActionCommand() == "Octagon")
		this.shapeSelected = "octagon";
	else if (e.getActionCommand() == "Red")
		this.colorSelected = "red";
	else if (e.getActionCommand() == "Blue")
		this.colorSelected = "blue";
	else if (e.getActionCommand() == "Green")
		this.colorSelected = "green";
	else if (e.getActionCommand() == "Yellow")
		this.colorSelected = "yellow";
	else if (e.getActionCommand() == "Purple")
		this.colorSelected = "purple";
	else if (e.getActionCommand() == "Orange")
		this.colorSelected = "orange";
	
	//set variables in canvas equal to these new ones
	this.canvas.shapeToDraw = shapeSelected;
	this.canvas.isFilled = filled;
	this.canvas.newColor = colorSelected;
	
	//test
	System.out.println("Num: " + shapeSelected);
	System.out.println("Color: " +colorSelected);
	System.out.println("Filled?: " + filled);
	

}



}
