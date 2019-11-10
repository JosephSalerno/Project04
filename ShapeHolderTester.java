/**
 * A <code>ShapeHolderTester</code> class that tests the ShapeHolder class, which holds 
 * shapes of type All Shapes in an array.
 *
 * @author JosephSalerno
 * @author BrendanOlski
 * @author MitchellThomas
 * Class: ShapeHolderTester.java
 * Project: 4
 */

import shapes.*;

public class ShapeHolderTester {
   
   public static void main(String[] args) {
      ShapeHolder sh = ShapeHolder.getInstance();
      
      sh.addShape(new Square());
      sh.addShape(new Circle());
      
      for (AllShapes shp : sh) {
         System.out.println(shp);
      }
   }
}
