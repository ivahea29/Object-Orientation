package task7;
/* @author Ivan Heaslip */
import static java.lang.System.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		 List<Shape> shapes = new LinkedList<>();
		 shapes.add(new Shape("white"));
		 shapes.add(new Rectangle("red", 10, 6));
		 shapes.add(new Rectangle("black", 20, 9));
		 shapes.add(new Shape("orange"));
		 showShapeNames(shapes);//produces output part 1
		 
		 Rectangle[] rectangleArray1 = {
				 new Rectangle("white", 4, 3),
				 new Rectangle("red", 9, 5),
				 new Rectangle("purple", 3, 6),
				 new Rectangle("orange", 15, 10),
				 new Rectangle("black", 4, 14),
		 };
		 Rectangle[] rectangleArray2 = {
				 new Rectangle("pink", 3, 4),
				 new Rectangle("red", 10, 2),
				 new Rectangle("white", 8, 5),
				 new Rectangle("blue", 14, 4),
				 new Rectangle("bindle", 10, 15),
		 };
		 
		 countOverlapRectangles(rectangleArray1, rectangleArray2);
	}
	public static void showShapeNames(List<Shape> shapes){
		for(Shape s : shapes) {
			out.println(s.getShapeType());
		}
	}
	public static void countOverlapRectangles(Rectangle[] group1, Rectangle[]group2){
	   	int colour = 0;
	   	for (Rectangle s1 : group1) {
	   		for(Rectangle s2 : group2) {
	   			if (s1.getColour().equals(s2.getColour())) {
	   				colour++;//found one duplicate
	   			}
	   		}
	   	 }
	   	out.printf("There are %d Rectangle objects with overlapping colour between the two arrays\n", colour);	 	
	   	
	   	int perimeter = 0;
	   	for (Rectangle s1 : group1) {
	   		for(Rectangle s2 : group2) {
	   			if (s1.getPerimeter() == s2.getPerimeter()) {
	   				perimeter++;//found one duplicate
	   			}
	   		}
	   	 }
	   	out.printf("There are %d Rectangle objects with overlapping perimeter between the two arrays", perimeter);
	}
		

}




  
// Create a class Shape, that contains:
// ▪ Private field with getter/setter: colour (String).
// ▪ A parameterized constructor that takes a single parameter and sets the field.
// ▪ A method getShapeType() that returns the message “I’m a Shape”.
// Method header: public String getShapeType()
// Create a class Rectangle, as subclass of Shape. It contains:
// ▪ Private fields with getter/setter: height (double), and width (double).
// ▪ A parameterized constructor that takes three parameters. Call superclass constructor using
// the “super” keyword.
// ▪ An override method getShapeType() that returns the message “I’m a Rectangle”.
// Method header: @Override public String getShapeType()
// ▪ A method getPerimeter() that calculates and returns the rectangle perimeter.
// Method header: public double getPerimeter()
// In the main() method below, two arrays of objects are created. Write the rest of code to produce the
// sample run output:
// public class Main {
// public static void main(String[] args) {
// List<Shape> shapes = new LinkedList<>();
// shapes.add(new Shape("white"));
// shapes.add(new Rectangle("red", 10, 6));
// shapes.add(new Rectangle("black", 20, 9));
// shapes.add(new Shape("orange"));
// showShapeNames(shapes);//produces output part 1
// Rectangle[] rectangleArray1 = {
// new Rectangle("white", 4, 3),
// new Rectangle("red", 9, 5),
// new Rectangle("purple", 3, 6),
// new Rectangle("orange", 15, 10),
// new Rectangle("black", 4, 14),
// };
// Rectangle[] rectangleArray2 = {
// new Rectangle("pink", 3, 4),
// new Rectangle("red", 10, 2),
// new Rectangle("white", 8, 5),
// new Rectangle("blue", 14, 4),
// new Rectangle("bindle", 10, 15),
// };
// v1
// produces output part 2
// countOverlapRectangles(rectangleArray1, rectangleArray2);
// }//end of main() method
// public static void showShapeNames(List<Shape> shapes){
// //Complete method to produce sample run output part 1
// Hint: iterate list “shapes”, invoke getShapeType() on each instance
// }
// public static void countOverlapRectangles(Rectangle[] group1, Rectangle[]
// group2){
// Complete method to produce sample run output part 2
// Note: you can assume that the colours/perimeters in each group are unique,
// i.e., there are no duplicate colours/perimeters within each group.
// }
// }//end of Main class
// Sample run output part 1:
// I’m a Shape
// I’m a Rectangle
// I’m a Rectangle
// I’m a Shape
// Sample run output part 2:
// There are 2 Rectangle objects with overlapping colour between the two arrays
// There are 3 Rectangle objects with overlapping perimeter between the two arrays