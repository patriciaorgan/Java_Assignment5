
public class SelectionSort {

	/** Patricia Organ - 01110489 - Assignment 5 Q2
	 * You are required to create an application, which creates an unsorted array 
	 * and passes it to a selection sort method for sorting. The application should 
	 * also contain a method to display the array before and after sorting.
	 */
	public static void main(String[] args) {
		// declare and initialize the Array with unsorted values
		//making the assumption it did not matter how the array was received so hard coding it
		// other alternatives could have been to generate a random number array, 
		//or to ask the user via joptionpane for values like the size of array and then individual values to populate the array
		
		int[] myArray = {1,4,53,3,7,123,543,653,987,10};
		
		//write to console before loop with the heading
		System.out.println("Array before sorting:");
		//display the array values in console with a loop through each element
		for (int i=0; i < myArray.length; i++){
			System.out.print(myArray[i] + " ");
		}
		
		//call the sorting method passing by reference myArray and the starting position as int
		SortingArray(myArray,0);
		
		//write to console before loop with the heading
		System.out.println("\nArray after sorting:");
		//display the array values in console with a loop through each element
		for (int i=0; i < myArray.length; i++){
			System.out.print(myArray[i] + " ");
		}
	}//end main method

	public static void SortingArray(int[] array, int start){
		//declare variable to hold the minimum value
		int min;
		//start by assigning the value of the first position to start comparing
		//in the array, starting point decided by the passed value assigned to local variable 'start'
		min = array[start]; //array passed by reference
		
		//loop through the array starting from the next position from start
		for (int i = start+1;i < array.length; i++ ){
			//compare min value to the value of position i in array 
			if (array[i] < min){
				//assign this new value to the start position
				array[start] = array[i];
				//swap the old min into that current position i in array
				array[i] = min;
				//now update the min value so it has the lowest value so far
				min = array[start];		
			}//end if
		}//end for
		
		//need a base case for recursion so don't need to call again when argument 
		//passed is equal to last position in array,
		//when there is only one cell left to sort it is already sorted
		if ((start + 1) != (array.length - 1)){
		//recursively call the sorting method again with a new start position one over
		SortingArray(array, start+1);
		}
	}//end method SortingArray
}//end Class SelctionSort
