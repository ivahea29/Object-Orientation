package task4;
/* @author Ivan Heaslip */
import static java.lang.System.out;

public class Main {

	public static void main(String[] args) {
	 
   	 //create array with ready content
   	String[] strarr1 = new String[] {"Red", "Blue", "Green", "Purple", "Black"};
   	for (String str : strarr1) {
   	out.println(str);
   	 }
   	String[] strarr2 = new String[] {"Green", "Red", "Grey", "White"};
   	int count = 0;//counter variable
   	for (String s1 : strarr1) {
   	for(String s2 : strarr2) {
   	if (s1.equals(s2)) {
   	count++;//found one duplicate
   	 }
   	 }
   	 }
   	out.println("Enter second line of colours: ");
   	out.println("Enter first line of colours: ");
   	out.println("You have entered 5 colours in the First line. ");
   	out.println("You Entered 4 colours in the Second line. ");
   	out.println("Number of overlapping colours: "); 
   	out.println(count);
   }
}    







//
//Write a program to ask the user to enter two lines of colour names, separated by comma. The
//program then calculates the number of overlapping colour names between the two lines.
//The following is a suggested approach:
//1. Read two strings, with each containing a bunch of colour names.
//2. Split each string into an array, with each array containing the corresponding colour names.
//3. Create an empty list of strings, which will be used to store the duplicate colour names in later
//step.
//4. Use two nested for loops to iterate the two arrays and add the duplicate colour names into the
//list created in the previous step.
//5. The list_name.size() method can be used to retrieve the number of common colour names in the
//list.
//6. Use a simple for loop to display the content of the list to output the common colour names.
//Note:
//• You do not have to perform user input checking.
//• You can assume the colour names within each line are unique.
//Sample run output as follows:
//Enter first line of colours: red,blue,green,purple,black
//Enter second line of colours: green,red,grey,white
//You entered 5 colours in first list
//You entered 4 colours in second list
//Number of overlapping colours: 2
//Overlapping colours are as follows:
//red
//green