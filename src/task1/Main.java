package task1;
/* @author Ivan Heaslip */
import static java.lang.System.out;

public class Main {

	public static void main(String[] args) {
		
		String fmt = "%-20s%-20s\n"; //create string format to format all lines into a table layout with two columns aligned to the left.
		out.printf (fmt,  "Escape Sequence", "Description"); //print heading text
		out.println ("-".repeat(45)); //print repeated dash character to create a divide between header and info
		out.printf (fmt, "\\n", "New line character"); //print lines using the format created above.
		out.printf (fmt, "\\t", "Horizontal tab character");
		out.printf (fmt, "\\\"", "Double quote character"); 
		out.printf (fmt, "\\b", "Backspace character");

	}

}
