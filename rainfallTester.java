import java.util.Scanner; // import this package to use it for input from user in console
public class rainfallTester {

	/**
	 *
	 */
	public static void main(String[] args) {
		// Declare array for inputed values of double type
		double[] myArray;
		//Initializing array as the question indicated it would be only for 12 months 
		//but the one place of setting size can easily be changed in future requirements
		myArray = new double[12];
		
		PopulateArray(myArray);
		CalculateArray(myArray);	
		

	}
	public static void PopulateArray(double[] array){
		int index;
		Scanner input = new Scanner(System.in);
		double rainfall;
	}
	public static void CalculateArray(double[] array){
		
	}

}
