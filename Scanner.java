/**
 * This class is meant to showcase the funcationalities of the Scanner class.
 * Its purpose is to allow users to have an object that is constantly reading the console.
 * 
 * Its functionalities allow us to turn those inputs (what
 * is written in the console) into variables (we will declare in our code)
 * 
 * @author josephtrauger
 * 
 */


//we must import the scanner because it is not automatically read by the compiler
//you do this at the very top of your code, right after your javadoc comment for the class
import java.util.Scanner;

public class ScannerTutorial 
{

	public static void main(String[] args) 
	{
		
		//when taking an input from the console, there are three tasks we must do
		//for the scanner to work
		
		//TASK 1: Open the scanner (instantiate a scanner object. 
		//the moment this line executes,
		//a Scanner object is created the constantly reads whatever we tell it to.
		//
		//System.in tells the constructor to read from the Console specifically 
		Scanner consoleReader = new Scanner(System.in);
		
		
		//TASK 2: instantiate a String object and assign it a value equal to the user's input
		//since we instantiated a scanner, we can use it to scan the console so it can read the user's input
		
		//as an example, let us scan in a name
		String myName = new String(  consoleReader.nextLine()  );
		
		//(ScannerName).nextLine() is what exact part that tells the Scanner to read in
		//the next line of input
		
		
		//let's also store a scanned age that we'll print later so we can see a different method
		int myAge = consoleReader.nextInt();
		
		// (ScannerName).nextInt() will read in just the next number,
		//and stop when it hits a space or new line
		
		
		
		
		//TASK 3: close the scanner. since it is always reading the console awaiting input,
		//it will continue this even after we give it explicit commands. so we need to tell it
		// directly to stop reading. it can rest.
		consoleReader.close();
		
		
		//TASK 4: actually print the string and int so we know it all worked
		System.out.print("My name is " + myName + ". I am " + myAge + " years old.");
		
		

	}

}
