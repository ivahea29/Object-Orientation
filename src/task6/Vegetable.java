package task6;
/* @author Ivan Heaslip */
public class Vegetable {
	
	private double weight;
	private double price;
	
	public Vegetable(double weight, double price)	{
		this.setWeight(weight);
		this.setPrice(price);	
	}		
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
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