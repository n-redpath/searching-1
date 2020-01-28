package lab5;

import cse131.NotYetImplementedException;

public class LinearSearch {
	/**
	 * @param array the array to be searched
	 * @param key   the value to be searched for
	 * @return the index of the first occurrence of key, if it is contained in the
	 *         array; otherwise -1.
	 */
	public static int findFirstIndexIn(String[] array, String key) {

		int returnIndex=0;
		int present =0;
			for (int i=0; i<array.length; i++) {
				if (!Strings.equals(array[i], key)) {
				}
				else {
					while (present ==0) {
					returnIndex =i;	
					present += 1;
					}
				}
			}
		
		if (present !=0) {
			return returnIndex; 
		}
		else {
			return -1;
		}

	}



}
