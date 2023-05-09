package task5;
/* @author Ivan Heaslip */
import static java.lang.System.out;
public class Note {

	private String pitch;
	
	private int duration;
	
	public Note(String pitch, int duration)	{
		this.setPitch(pitch);
		this.setDuration(duration);
	}
	
	public void playNote()	{
		out.printf("The note &s is played for &d seconds", pitch, duration);		
	}
	
	public String getPitch() {
		return pitch;
	}
	public void setPitch(String pitch) {
		this.pitch = pitch;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}




}


//Create a class Note, as in note in music. A Note object is represented by a pitch (one of the seven
//letters – C, D, E, F, G, A, and B – which is the simplest and most common way of specifying a music
//note), and a duration (in number of seconds). Write the class Note that contains*
//• Private class fields with getter/setter: pitch (String), duration (int).*
//• A parameterized constructor that takes two parameters and sets the fields.*
//• A public method playNote() that outputs the pitch and the duration of a note in the format as in
//the sample output below (i.e., “The note <pitch letter> is played for <duration> seconds”).
//Method header is given as following: public void playNote()
//• The code in main() is given below. A list of Note instances were created and passed as
//parameter to the methods. Complete the method processNotes.
//public class Main {
//public static void main(String[] args){
//List<Note> notes = new LinkedList<>();
//notes.add(new Note("D", 19));
//notes.add(new Note("C", 20));
//notes.add(new Note("F", 31));
//notes.add(new Note("B", 45));
//notes.add(new Note("C", 73));
//notes.add(new Note("F", 13));
//notes.add(new Note("B", 34));
//notes.add(new Note("C", 53));
//processNotes(notes);
//}//end of main method
//public static void processNotes(List<Note> notes){
//// Complete method
//}
//}//end of class Main
//The processNotes method displays each Note instance and calculates the total duration value. See
//sample run output below. Hint, use a loop to iterate the “notes” list and invoke playNote() method
//on each instance; use a total variable to accumulate the duration of each instance (this can be done
//in the same loop).
//Sample run output:
//The note D is played for 19 seconds
//The note C is played for 20 seconds
//The note F is played for 31 seconds
//The note B is played for 45 seconds
//The note C is played for 73 seconds
//The note F is played for 13 seconds
//The note B is played for 34 seconds
//The note C is played for 53 seconds
//Total duration: 288 seconds