/**
 * A <code>ShapeHolder</code> class that implements Iterable<AllShapes>
 * to create an array of shapes to be iterator by the iterator class.
 *
 * @author JosephSalerno
 * @author BrendanOlski
 * @author MitchellThomas
 * Class: ShapeHolder.java
 * Project: 4
 */

package shapes;

import java.lang.reflect.Array;
import java.util.Iterator;

public class ShapeHolder implements Iterable<AllShapes>{

    private static ShapeHolder instance;
    private AllShapes []shapes = new AllShapes[50];
    private int index;
    
    /**
     * Create or get an instance of ShapeHolder.
     * @return an instance of ShapeHolder
     */
    public static ShapeHolder getInstance(){
       if (instance == null) {
         instance = new ShapeHolder();
       }
       return instance;
    }
	
    /**
     * iterator method to implement the iterator on the iterable
     * @return instance of ShapeHolderIterator
     */
     public Iterator<AllShapes> iterator() {
          return new ShapeHolderIterator(this);
     } 
    
    /**
     * Add a shape to the shapes array in ShapeHolder
     * @param s - a shape of type AllShapes
     */
     public void addShape(AllShapes s) {
        shapes[index] = s;
        index++;
     }
   
     /**
     * Return the array of shapes in ShapeHolder
     * @return shapes - array of shapes
     */
     public AllShapes[] getShapes() {
        return shapes;
     }
     
     /**
     * Return the size of the shapes array
     * @return index - size of the shapes array
     */
     public int size()
     {
    	 return index;
     }
     
     /**
     * Return shape at specific index
     * @param i - the index of the shape being returned
     * @return shapes[i] - shape at index i
     */
     public AllShapes getShape(int i)
     {
    	 return shapes[i];
     }
	
     /**
     * Add a shape at a specific index
     * @param i - int i for index 
     * @param newVal - shape to be added of type AllShapes
     */
     public void setShape(int i, AllShapes newVal) {
    	 shapes[i] = newVal;
     }
}

/**
* <code>ShapeHolderIterator</code> class that implements Iterator<AllShapes>
* to be an iterator for the iterable, ShapeHolder.
*/
class ShapeHolderIterator implements Iterator<AllShapes>{
  
     int current;
     ShapeHolder data;
     
     /**
     * Initialize pointer to head of the array for iteration
     * @param instance of ShapeHolder
     */
     public ShapeHolderIterator(ShapeHolder data)
     {
       this.data = data;
       current = 0;
     }

     /**
     * Checks if the next element exists
     * @return boolean - true or false if next element exists
     */
     public boolean hasNext() {
          return current < data.size();
     } 
    
     /**
     * Moves the cursor/iterator to the next element
     * @return shape - return next element in shapes array
     */	
     public AllShapes next() {
    	 return data.getShape(current++);
     }
 }
