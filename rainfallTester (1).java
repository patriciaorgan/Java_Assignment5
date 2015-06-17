import java.util.Scanner; // import this package to use it for input from user in console
public class rainfallTester {

	/** Patricia Organ - 01110489 - Assignment 5 Q1
	 *Write an application that uses an array data structure to store 12 numerical values 
	 *entered by the uses.  Each of these values represents the amount of rainfall for a 
	 *particular month of the year.  The application should declare and create the array 
	 *and then pass it to a method called populateArray, which takes input from the user 
	 *and inserts it into the array.  The application should then pass the array to a method 
	 *called calculateAverage, which will calculate and return the average rainfall for the 
	 *12 months entered.
	 */
	public static void main(String[] args) {
		// Declare array for inputed values of double type
		//Initializing array as the question indicated it would be only for 12 months 
		//but the one place of setting size can easily be changed in future requirements 
		//if required and methods will still work
		double[] myArray = new double[12];
		
		//call the populate method to ad the value to the array
		PopulateArray(myArray);
		// now the array is full we need to call the calculate average method to output the average
		CalculateAverage(myArray);	
	} //end main
	
	public static void PopulateArray(double[] array){
		
		//Scanner object declared to receive the values coming in from user
		Scanner input = new Scanner(System.in); 
		
		//loop from 0 to 11 if array length is 12
		//I used array.length to keep the method flexible to any number of months input
		for(int index=0; index < array.length; index++){
			//asking user for the rainfall and using the index plus 1 as it started at 0
			System.out.print("Enter rainfall in cm for month "+ (index+1) + " ");
			
			//assign the input value to the index position of array, allowing a decimal value
			array[index] = input.nextDouble();
		}
		//for clean code can close the input object once method completed
		input.close();
	}//end method PopulateArray
	
	public static void CalculateAverage(double[] array){
		//declare  and initialize local variable to keep running total required to calculate average
		double total = 0;
		// declare variable in loop, and loop from 0 to 11 if array length is 12
		for (int index=0; index <array.length; index++){
			//use the shorthand operand to add value to the total variable
			total += array[index];
		}
		//once loop is complete output to console the average, using printf to display result in 2 decimals
		System.out.printf("Annual Average Rainfall: %.2f", (total/array.length));
		//I used array.length to keep the method flexible to any number of months inputed	
	}//end method CalculateAverage

}//end class rainfallTester
