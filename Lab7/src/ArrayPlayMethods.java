import java.util.Arrays;

public class ArrayPlayMethods {
	public static void printArray(int[] numbers) {
		System.out.println(Arrays.toString(numbers));
	}

	public static void negativeOneArray(int size) {
		int NUM_VALS = size;
		int[] array = new int[NUM_VALS];
		for (int i = 0; i < NUM_VALS; i++) {
			array[i] = -1;
		}
		printArray(array);

	}

	public static void indexArray(int size) {
		int NUM_VALS = size;
		int[] array = new int[NUM_VALS];
		for (int i = 0; i < NUM_VALS; i++) {
			array[i] = i;
		}
		printArray(array);
	}

	public static void zeroArray(int size) {
		int NUM_VALS = size;
		int[] array = new int[NUM_VALS];
		for (int i = 0; i < NUM_VALS; i++) {
			array[i] = 0;
		}
		printArray(array);
	}

	public static void faceFrequency(Die die) {
		int NUM_VALS = 6;
		int[] array = new int[NUM_VALS];
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;

		die = new Die();
		for (int i = 1; i <= 100; i++) {
			if (die.roll() == 1)
				array[0] = count1++;
			if (die.roll() == 2)
				array[1] = count2++;
			if (die.roll() == 3)
				array[2] = count3++;
			if (die.roll() == 4)
				array[3] = count4++;
			if (die.roll() == 5)
				array[4] = count5++;
			if (die.roll() == 6)
				array[5] = count6++;
		}

		System.out.println();
		for (int i = 1; i <= NUM_VALS; i++) {
			System.out.println(i + " was rolled " + array[i - 1] + " times.");
		}
		System.out.println();
	}

	public static void printTabularArrays() {
		double[] doubleArray1 = new double[] { 0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0 };
		double[] doubleArray2 = new double[10];

		System.out.println("Before: ");
		for (int i = 0; i < doubleArray1.length; i++) {
			System.out.println(doubleArray1[i] + "\t" + doubleArray2[i]);
		}

		for (int i = 0; i < doubleArray1.length; i++) {
			doubleArray2[i] = doubleArray1[i];
		}

		System.out.println();

		System.out.println("After: ");
		for (int i = 0; i < doubleArray1.length; i++) {
			System.out.println(doubleArray1[i] + "\t" + doubleArray2[i]);
		}

		System.out.println();
		System.out.println("Modified: ");
		doubleArray1[0] = 999.0;
		doubleArray2[1] = 888.0;
		for (int i = 0; i < doubleArray1.length; i++) {
			System.out.println(doubleArray1[i] + "\t" + doubleArray2[i]);
		}

	}

}