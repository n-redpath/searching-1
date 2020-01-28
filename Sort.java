package lab5;

import cse131.NotYetImplementedException;

public class Sort {
	/**
	 * @param array     the array to search
	 * @param fromIndex the index from which to search until the each of the array
	 * @return the index of the lexicographically earliest value
	 */
	public static int findIndexOfLexicographicallyEarliestValue(String[] array, int fromIndex) {

		int returnIndex=fromIndex;
		
		String less = array[fromIndex];

		
		for (int i=fromIndex; i<array.length; ++i) {
			
			if (Strings.isLessThan(array[i], less)) {
				returnIndex = i;
				less = array[i];
			}	
		}
		return returnIndex;
	}



	

	/**
	 * @param array  the array to mutate
	 * @param aIndex index whose value should be swapped with the value at
	 *               array[bIndex]
	 * @param bIndex index whose value should be swapped with the value at
	 *               array[aIndex]
	 */
	public static void swapValuesAtIndicesInPlace(String[] array, int aIndex, int bIndex) {



		if (aIndex!=bIndex) {

			String x = array[aIndex]; 
			String y= array[bIndex];

			array[aIndex]=y;
			array[bIndex] = x;

		}

	}

	/**
	 * @param array the array to sort in place
	 */
	public static void selectionSortInPlace(String[] array) {


		for (int i =0; i<=array.length; ++i){


			for (int j=i+1; j<array.length; j++) {

				if (Strings.isLessThan(array[j], array[i])) {
					swapValuesAtIndicesInPlace(array, i, j);

				}

			}

		}

	}

	/**
	 * @param array the array to determine whether or not it is sorted
	 * @return true if the array is sorted, otherwise false.
	 */
	public static boolean isSorted(String[] array) {


		int tru= 0; 
		for (int i=0; i<array.length-1; ++i) {
			if (Strings.isLessThan(array[i], array[i+1])) {
				tru +=1;
			}
		}
		if (tru==(array.length-1)) {
			return true; 
		}
		else if (array.length ==0) {
			return true;
		}
		else {
			return false;
		}
	}
}
