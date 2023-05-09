package task10;

public class AudioBook extends Book{
	    private double length;

	    public AudioBook(double length, int year, String name) {
	        super(name, year);
	        this.setLength(length);
	    }

	    public double getLength() {
	        return length;
	    }

	    public void setLength(double length) {
	        this.length = length;
	    }
	    
	    public void displayInfo() {
	    	System.out.printf("Book name %s\n ", getName());
	    	System.out.printf("Publish year %d\n ", getYear());
	    	System.out.printf("Length (hours) %.1f\n\n ", getLength());
	}
}
