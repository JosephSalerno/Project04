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
General description of the class and how it works
--Variables--

--Methods--
