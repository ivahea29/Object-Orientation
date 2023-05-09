package task10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class AudioBookApp {
	private List<AudioBook> bookList;
	public List<AudioBook> getBookList() {
	return bookList;
	}
	
	public AudioBookApp(String filename) throws IOException {
	bookList = new LinkedList<>();
	readData(filename);
	}
	
	public void readData(String filename) throws IOException {
        bookList = new LinkedList<>();
        Path path = Paths.get(filename);
        List<String> lines = Files.readAllLines(path);
        for (String line : lines) {
            String[] items = line.split(",");
            String name = items[0];
            int year = Integer.valueOf(items[1]);
            double length = Double.valueOf(items[2]);
            AudioBook b = new AudioBook(length, year, name);
            bookList.add(b);
        }	
	}
	public AudioBook getShortestBook() {
		AudioBook shortbook = bookList.get(0);
        for(AudioBook b : bookList) {
            if(b.getLength() < shortbook.getLength()) {
                shortbook = b;
            }
        }
        return shortbook;
	}
	public int countBooks() {
        int count = 0;
        int year = 0;
        for (AudioBook b : bookList) {
            year = b.getYear();
            if(year >= 2010 && year <= 2020) {
                count++;
            }
        }
        return count;
    }
	public void randomBookList() {
		List<AudioBook> b1 = new LinkedList<>();
		List<AudioBook> b2 = new LinkedList<>();
		List<AudioBook> b3 = new LinkedList<>();
		for(AudioBook a : bookList) {
			int num = ThreadLocalRandom.current().nextInt(1,4);
			if(num == 1) {
				b1.add(a);
			}
			else if(num == 2) {
				b2.add(a);
			}
			else if(num == 3) {
				b3.add(a);
			}
		}
	}
}

