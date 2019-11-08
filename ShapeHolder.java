/**
 * A <code>ShapeHolder</code> class 
 * @author JosephSalerno
 * @author BrendanOlski
 * @author MitchellThomas
 * Class: ShapeHolder.java
 * Project: 4
 */

package shapes;

import java.lang.reflect.Array;
import java.util.Iterator;

public class ShapeHolder implements Iterator<AllShapes>{

    private static ShapeHolder instance;
    private AllShapes []shapes = new AllShapes[50];
    private int index;
    
    public static ShapeHolder getInstance(){
       if (instance == null) {
         instance = new ShapeHolder();
       }
       return instance;
    }

     public ShapeHolderIterator iterator() {
          return new ShapeHolderIterator(this);
     } 
    
     public void addShape(Object name) {
        int index = 0;
        shapes[i] = new name();
        index++;
     }
   
     public AllShapes[] getShapes() {
        return shapes;
     }

}

public class ShapeHolderIterator implements Iterator<AllShapes>{
   
     int current;
     ShapeHolder data;
     
     // initialize pointer to head of the list for iteration 
     public ShapeHolderIterator(ShapeHolder data)
     {
       this.data = data;
       current = 0;
     }

     // Checks if the next element exists 
     public boolean hasNext() {
          return current < data.size();
     } 
    
     // moves the cursor/iterator to next element 
     public AllShapes next() {
          return data.getInt(current++);
     }
}



//    private AllShapes [] shapes;
//    int pos;
   
//    // initialize pointer to head of the list for iteration 
//    public ShapeIterator(AllShapes []shapes){
//         this.shapes = shapes;
//    }
   
//    // Checks if the next element exists
//    public boolean hasNext() {
//         if(pos >= shapes.length || shapes[pos] == null) {
//             return false;
//             }
//         return true;
//    }

//    // moves the cursor/iterator to next element
//    public AllShapes next() {
//         return shapes[pos++];
//    }
