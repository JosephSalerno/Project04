package shapes;

public class ShapeTester {

	public static void main(String[] args) {
			
			//====================================//
			//Circle testing
			Circle circle1 = new Circle();
			System.out.println(circle1);
			
			System.out.println("Set circle radius to 5: " );
			circle1.setRadius(5);
			System.out.println("Set circle color to blue: " );
			circle1.setColor("Blue");
			System.out.println("Set circle x to 2: " );
			circle1.setX(2);
			System.out.println("Set circle y to 3: " );
			circle1.setY(3);
			System.out.println("Set fill to true: " );
			circle1.setFill(true);
			System.out.println("Is the shape filled: " + circle1.isFilled());

			System.out.println(circle1);
			Circle circle2 = new Circle(5,"Blue",8,10,true);
			System.out.println("Create a new circle for comparison: ");
			System.out.println(circle2);

			System.out.println("Are the circles equal? " + circle1.equalsTo(circle2) + "\n");

			//====================================//
			//Oval testing
			Oval oval1 = new Oval();
			System.out.println(oval1);
			System.out.println("Set radius to 5: " );
			oval1.setRadius(5);
			System.out.println("Set height to 5: " );
			oval1.setHeight(3);
			System.out.println("Set color to blue: " );
			oval1.setColor("Blue");
			System.out.println("Set x to 2: " );
			oval1.setX(2);
			System.out.println("Set y to 3: " );
			oval1.setY(3);
			System.out.println("Set fill to true: " );
			oval1.setFill(true);
			System.out.println("Is the shape filled: " + oval1.isFilled());
			


			System.out.println(oval1);
			System.out.println("Create new oval for comparison: ");
			Oval oval2 = new Oval(5,3,"Blue", 2,3, true);
			System.out.println(oval2);

			System.out.println("Are the ovals equals? " + oval1.equalsTo(oval2) + "\n");

			//====================================//
			//Square testing
			Square square1 = new Square();
			System.out.println(square1);
			System.out.println("Set width to 5: " );
			square1.setWidth(5);
			System.out.println("Set color to blue: " );
			square1.setColor("Blue");
			System.out.println("Set x to 2: " );
			square1.setX(2);
			System.out.println("Set y to 3: " );
			square1.setY(3);
			System.out.println("Set fill to true: " );
			square1.setFill(true);
			System.out.println("Is the shape filled: " + square1.isFilled());


			System.out.println(square1);
			System.out.println("Create new square for comparison: ");
			Square square2 = new Square(5,"yellow", 2, 2, true);
			System.out.println(square2);

			System.out.println("Are the squares equal? " + square1.equalsTo(square2) + "\n");

			//====================================//
			//Rectangle testing
			Rectangle rec1 = new Rectangle();
			System.out.println(rec1);
			System.out.println("Set width to 5: " );
			rec1.setWidth(5);
			System.out.println("Set height to 3: " );
			rec1.setHeight(3);
			System.out.println("Set color to blue: " );
			rec1.setColor("Blue");
			System.out.println("Set x to 2: " );
			rec1.setX(2);
			System.out.println("Set y to 3: " );
			rec1.setY(3);
			System.out.println("Set fill to true: " );
			rec1.setFill(true);
			System.out.println("Is the shape filled: " + rec1.isFilled());

			System.out.println(rec1);
			
			System.out.println("Create new rectangle for comparison");
			Rectangle rec2 = new Rectangle("yellow", 2, 2, 10, 5, true);
			
			System.out.println(rec2);

			System.out.println("Are the rectangles equal? " + rec1.equalsTo(rec2) + "\n");

			//====================================//
			//Triangle testing
			Triangle triangle1 = new Triangle();
			System.out.println(triangle1);
			System.out.println("Set base to 5: " );
			triangle1.setBase(5);
			System.out.println("Set height to 3: " );
			triangle1.setHeight(3);
			System.out.println("Set color to blue: " );
			triangle1.setColor("Blue");
			System.out.println("Set x to 2: " );
			triangle1.setX(2);
			System.out.println("Set y to 3: " );
			triangle1.setY(3);
			System.out.println("Set fill to true: " );
			triangle1.setFill(true);
			System.out.println("Is the shape filled: " + triangle1.isFilled());


			System.out.println(triangle1);
			System.out.println("Create new triangle for comparison");
			Triangle triangle2 = new Triangle(10,10,"purple", 0, 0, false);
			System.out.println(triangle2);

			System.out.println("Are the triangles equal? " + triangle1.equalsTo(triangle2) + "\n");

			//====================================//
			//Octagon testing
			
			Octagon oct1 = new Octagon();
			System.out.println(oct1);
			System.out.println("Set width to 9: " );
			oct1.setWidth(9);
			System.out.println("Set height to 4: " );
			oct1.setHeight(4);
			System.out.println("Set color to blue: " );
			oct1.setColor("Blue");
			System.out.println("Set x to 0: " );
			oct1.setX(0);
			System.out.println("Set y to 0: " );
			oct1.setY(0);
			System.out.println("Set fill to true: " );
			oct1.setFill(true);
			System.out.println("Is the shape filled: " + oct1.isFilled());

			System.out.println(oct1);
			
			System.out.println("Create new octagon for comparison");
			Octagon oct2 = new Octagon("Green", 0, 0, 5, 10, true);
			
			System.out.println(oct2);

			System.out.println("Are the octagons equal? " + oct1.equalsTo(oct2) + "\n");


		}

	}
