package task10;
/* @author Ivan Heaslip */
import static java.lang.System.*;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// Main method to pass data file into the txtfile variable for use in other classes. 
		// Displays calculations and lists from AudioBookApp class based on sample output.
		// Exception handling try catch, in case of errors.
		String txtfile = "data/audiobookdata.txt";
		try {
			AudioBookApp app = new AudioBookApp(txtfile);
			AudioBook shortest = app.getShortestBook();
			if(shortest != null) {
				out.println("Shortest book: ");
				shortest.displayInfo();
			}
			out.printf("Books published btw 2010-2020: %d\n\n", app.countBooks());
			app.randomBookList();
		}catch(IOException ioe) {
			out.printf("Perhaps missing text file: %s/%s? \n\n", new Main().getClass().getPackage().getName(), txtfile);
		}

	}

}


