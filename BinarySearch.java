package lab5;

import cse131.NotYetImplementedException;

public class BinarySearch {
	 * @param a a value
	 * @param b another value
	 * @return the midpoint of a and b
	 */
	public static int calculateMidPoint(int a, int b) {

		int sum = a+b;
		return sum/2;
	}


	/** 
	 * @param array the array to be searched
	 * @param key   the value to be searched for
	 * @return an index of an occurrence of key, if it is contained in the array;
	 *         otherwise -1.
	 */
	public static int findIndexInSorted(String[] array, String key) {
		
		int returnIndex=-1;
		int start = 0;
		int end = array.length;

		

		while (start<end) {
			
			int mid = calculateMidPoint(start, end);

			if (Strings.equals(array[mid], key)) {
				returnIndex=mid;
				break;
			}

			else if (Strings.isGreaterThan(array[mid], key)) {	
				end =mid;		

			}
			else if (Strings.isLessThan(array[mid], key)) {
				start = mid+1;
			}

		}

		return returnIndex;



}
}


