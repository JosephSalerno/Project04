# Project04
Project with the purpose of adding an interactive GUI to the previously created Project 3. This pop-up GUI allows the user to manipulate shapes, change their colors, size, ect. 

Project 4
CS 209 Fall 2019
By Mitchell Thomas, Joe Salerno, and Brendan Olski

===Features===
--Selection of shapes--
Describe how you programmed the selection of shapes in a general sense, include descriptions of any patterns you used.
--Dragged shape preview--
etc
--Other features--
etc etc

===ShapeHolder===
ShapeHolder.java contains a ShapeHolder class that works with the ShapeHolderIterator class to store an array of shapes of type AllShapes in order to maintain shapes and their data from the Canvas.

--Variables--
index: private int variable keeping track of the pointer in the array shapes (also the size of the array shapes)
shapes: private AllShapes array that holds the shapes and its data for ShapeHolder class, max size of 50 shapes
instance: private static instance of ShapeHolder

--Methods--
getInstance() - Create or get an instance of ShapeHolder.
iterator() - iterator method to implement the iterator on the iterable shapes array
addShape(AllShapes s) - Add a shape to the shapes array in ShapeHolder, parameter is a shape of type AllShapes
getShapes() - Return the array of shapes in ShapeHolder
size() - Return the size of the shapes array
getShape(int i) - Return shape at specific index i
setShape(int i, AllShapes newVal) - Add a shape (newVal) at a specific index i

===ShapeHolderIterator===
ShapeHolderIterator is a class in ShapeHolder.java that works to iterate the iterable array of shapes in the ShapeHolder class.

--Variables--
current: int variable for the current index in the shapes array
data: instance variable of ShapeHolder, holds information on shapes array

--Methods--
ShapeHolderIterator(ShapeHolder data) - Initialize pointer to head of the array for iteration
hasNext() - Checks if the next element exists, return true or false if next element exists
next() - Moves the cursor/iterator to the next element, returns the next element in the shapes array

===ShapeDrawGUI===
A ShapeDrawGUI class that sets the dimensions and buttons of the GUI window. Also updates the states of the current shape, current color, and whether or not the shape is filled, and tells the GUI to draw this shape.

--Variables--
canvas: private instance variable of type Canvas 
colorSelected: private static String variable used to set color of shape in the GUI frame
shapeSelected: private static String variable used to set shape in the GUI frame
filled: private static boolean variable for if the shape is filled or not
"shape"Button: private JButton variable for each "shape" in our shapes package and in the GUI
"color"Button: private JButton variable for each "color" available in the GUI frame
filledCheckBox: private JCheckBox variable for the check box button that fills in color of a shape in the GUI frame

--Methods--
ShapeDrawGUI() - Sets the layout of the GUI window, as well as the buttons and the check box using ActionListeners.
actionPerformed(ActionEvent e) - This method tells the GUI which shape and color to draw once the user has chosen a certain shape by clicking a combination of buttons, and whether or not the shape is filled. It also sets the state variables in Canvas equal to the new assigned values, and has a tester that outputs text to confirm that the variables have been updated correctly.
main() - starts main frame and shows window

===Canvas===
 A Canvas class that sets the color and fill of the shape and allows the user to drag the mouse to create a new shape. Also sticks the shape to the display when the mouse is released.
 
--Variables--
posStart: private Point variable, start of user's mouse action event
posEnd: private Point variable, end of user's mouse action event
drawRect: private java.awt.Rectangle variable, rectangle that surrounds the shapes being drawn
isFilled: public boolean variable that keeps track of if the shape is filled or not
newColor: public String variable, color being used for the shapes being drawn
shapeToDraw: public String variable, shape to be drawn (appears within dragged rectangle)
drawnShape: private AllShapes, shape to be added to ShapeHolder
holder: private ShapeHolder instance variable, used to store shapes and be iterated through when finalizing drawn shapes

--Methods--
Canvas() - Constructor method that establishes default settings for shape and background color, and adds listeners.
paintComponent(Graphics g) - Sets the color of the shape based on which shape and color buttons have been pressed, and draws the shape from shapeholder as well as drawing the shape with its outlining rectangle as the mouse is dragged
mouseEntered(MouseEvent e) - needed for mouse listeners
mouseExited(MouseEvent e) - needed for mouse listeners
mouseMoved(MouseEvent e) - needed for mouse listeners
mousePressed(MouseEvent e) - Tells the program what to do when the user presses down on the mouse.
mouseReleased(MouseEvent e) - Tells the program what to do when the user releases the mouse.
mouseDragged(MouseEvent e) - Tells the program what to do when the user drags the mouse.
mouseClicked(MouseEvent e) - Tells the program what to do when the user clicks the mouse.
updateRectangle() - Updates the rectangle based on the first and current mouse positions.
changeColor(String c, Graphics g) - Method changes the color of the canvas
drawShape("Shape" s, Graphics g) - draws "Shape" s
