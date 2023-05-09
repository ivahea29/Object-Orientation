package task2;
/* @author Ivan Heaslip */
import static java.lang.System.*;
import java.util.Scanner;

public class Main {
	
	static Scanner input = new Scanner(in);

	public static void main(String[] args) {
		calculateCircles();
	}
	public static void calculateCircles() {
		out.print("Enter circle radius: ");
		double radius = Double.parseDouble(input.nextLine());
		double area =  radius * radius * Math.PI;
		double diameter = radius * 2;
		double perimeter = diameter * Math.PI;
		String format = "%-12s%-12s%-12s\n";
		out.printf(format, "radius", "perimeter", "Area");
		out.printf("-".repeat(30));
		String format2 = "%-12.2f%-12.2f%-12.2f";
		out.printf(format2, radius, perimeter, area);
	}
}	