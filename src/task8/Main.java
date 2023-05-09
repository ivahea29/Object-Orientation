package task8;
/* @author Ivan Heaslip */
import java.util.*;
import static java.lang.System.*;

public class Main {

	public static void main(String[] args) {
		List<Bag> bags = new LinkedList<>();
		bags.add(new Bag("white", 4));
		bags.add(new Bag("red", 5));
		bags.add(new Bag("black", 3.90));
			 
			 
		BagApp bgapp = new BagApp();
		double totalCapacity = bgapp.calcTotalCapacity(bags);
		out.printf("Total capacity: %.2f\n", totalCapacity);
		out.printf("Total number of bags: %d\n", bags.size());
	}
}
	
class BagApp {
		
	public double calcTotalCapacity(List<Bag> bagList) {
		if (bagList == null || bagList.size() == 0) return 0;
		double capacity = bagList.get(0).getCapacity();
		List<Bag> sub = bagList.subList(1, bagList.size());
		return capacity + calcTotalCapacity(sub);

				}
	}
