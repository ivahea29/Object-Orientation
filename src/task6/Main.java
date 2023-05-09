package task6;
/* @author Ivan Heaslip */
import java.util.*;
import static java.lang.System.*;
public class Main {
	public static void main(String[] args){
		List<LeafyGreen> veges = new LinkedList<>();
		veges.add(new LeafyGreen(10, 3.5, "Cabbage"));
		veges.add(new LeafyGreen(5, 2.94, "Lettuce"));
		veges.add(new LeafyGreen(20, 5.45, "Brocccoli"));
		veges.add(new LeafyGreen(7, 1.94, "Lettue"));
		veges.add(new LeafyGreen(15, 2.8, "Lettuce"));
		veges.add(new LeafyGreen(30, 2.5, "Cabbage"));
		veges.add(new LeafyGreen(28, 4.4, "Broccoli"));
		veges.add(new LeafyGreen(20, 5.5, "Cabbage"));
		veges.add(new LeafyGreen(16, 3.9, "Broccoli"));
		veges.add(new LeafyGreen(26, 4.8, "Broccoli"));
		calculateStats(veges);
		
		}
	
	public static void calculateStats(List<LeafyGreen> veges){
	// Complete this method to produce the sample output below
		double vegeCost = 0;
		double cabbageWeight = 0;
		double brocolliWeight = 0;
		double lettuceWeight = 0;
	
		for(LeafyGreen l : veges) {
			vegeCost += l.getWeight() * l.getPrice();
		}	
		out.printf("Total Vegetable cost: $%.1f\n", vegeCost);	
		
		for(LeafyGreen l : veges) {
			if(l.getType().equals("Cabbage")) {
					cabbageWeight += l.getWeight();
			}
		}
		out.printf("Total Cabbage weight: %.1f kg\n", cabbageWeight);
		
		for(LeafyGreen l : veges) {
			if(l.getType().equals("Broccoli")) {
					brocolliWeight += l.getWeight();
			}
		}
		out.printf("Total Brocolli weight: %.1f kg\n", brocolliWeight);
		
		for(LeafyGreen l : veges) {
			if(l.getType().equals("Lettuce")) {
					lettuceWeight += l.getWeight();
			}
		}
		out.printf("Total Lettuce weight: %.1f kg", lettuceWeight);
	}
}
	
		
		
	


//  Create class Vegetable, with:
//  ▪ Private fields with getter/setter: weight (double, measured in kg), price (double, as in $NZ
//  dollars per kg)*
//  ▪ A parameterized constructor that takes two parameters.
//  Create class LeafyGreen, as subclass of Vegetable. It contains:
//  ▪ Private field with getter/setter: type (string, as in one of three leafy green vegetable types:
//  cabbage, Lettuce, broccoli)
//  ▪ A parameterized constructor that takes three parameters. Call superclass constructor using
//  the “super” keyword.
//  The code in main() is given below. A list of LeafyGreen instances are created and passed as
//  parameter to the method calculateStats().
//  public class Main {
//  public static void main(String[] args){
//  List<LeafyGreen> veges = new LinkedList<>();
//  veges.add(new LeafyGreen(10, 3.5, "Cabbage"));
//  veges.add(new LeafyGreen(5, 2.94, "Lettuce"));
//  veges.add(new LeafyGreen(20, 5.45, "Broccoli"));
//  veges.add(new LeafyGreen(7, 1.94, "Lettuce"));
//  veges.add(new LeafyGreen(15, 2.8, "Lettuce"));
//  veges.add(new LeafyGreen(30, 2.5, "Cabbage"));
//  veges.add(new LeafyGreen(28, 4.4, "Broccoli"));
//  veges.add(new LeafyGreen(20, 5.5, "Cabbage"));
//  veges.add(new LeafyGreen(16, 3.9, "Broccoli"));
//  veges.add(new LeafyGreen(26, 4.8, "Broccoli"));
//  calculateStats(veges);
//  }//end of main
//  public static void calculateStats(List<LeafyGreen> veges){
//   Complete this method to produce the sample output below
//  }
//  }//end of class Main
//  Note, the first instance in the list, new LeafyGreen(10, 3.5, "Cabbage"), its weight is 10
//  kg, price is $3.5/kg, vege type is Cabbage. Its cost is calculated as: 10kg x $3.5/kg =
//  $35.0. The method calculateStats() calculates the following:
//  • the total cost of all instances in the list
//  • the total weight of each of the three types: Cabbage, Broccoli, and Lettuce
//  Sample run output:
//  Total vegetable cost: $709.7
//  Total Cabbage weight: 60.0 kg
//  Total Broccoli weight: 90.0 kg
//  Total Lettuce weight: 27.0 kg