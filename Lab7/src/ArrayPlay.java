

public class ArrayPlay {

	public static void main(String[] args) {
		final int NUM_VALS = 6;
		int[] array = new int[NUM_VALS];
		Die die = new Die();
		ArrayPlayMethods arrayPlay = new ArrayPlayMethods();
		
		
		printArray(array); //print array
		negativeOneArray(NUM_VALS);//print negative one array
		indexArray(NUM_VALS);//print index array
		zeroArray(NUM_VALS);//print zero array
		faceFrequency(die);//method that rolls a die 100 times and counts how many times each number occurs
		printTabularArrays(); //prints tabular array and shows they can be modified
		

	}

}
