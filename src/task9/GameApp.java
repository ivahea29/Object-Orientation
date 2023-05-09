package task9;
/* @author Ivan Heaslip */
import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;
import static java.lang.System.*;

public class GameApp {
	
	Scanner input = new Scanner(in);
	
	private List<Country> countryList;
	public GameApp(String filename) throws IOException {
		countryList = new LinkedList<>();
		readData(filename);
	}
	
    public void readData(String filename) throws IOException {
        countryList = new LinkedList<>();
        Path path = Paths.get(filename);
        List<String> lines = Files.readAllLines(path);
        for (String line : lines) {
            String[] items = line.split(",");
            String name = items[0];
            String capital = items[1];
            int population = Integer.valueOf(items[2]);
            Country b = new Country(name, capital, population);
            countryList.add(b);
        }
    }
	
	public void game() {
		int num = ThreadLocalRandom.current().nextInt(0, 6);
		for(Country b : countryList) {
			if(num == countryList.indexOf(b)) {
				out.printf("Whats the capital of %s ", b.getName());
				String question = input.nextLine();
				if(question.equals(b.getCapital())) {
					out.printf("Well done! ");
				}
				else {
					out.printf("Incorrect. It’s %s\n", b.getCapital());
				}
				out.printf("%s is a country of %d million. ", b.getName(), b.getPopulation());
			}
		}
	}
	}




	
	
