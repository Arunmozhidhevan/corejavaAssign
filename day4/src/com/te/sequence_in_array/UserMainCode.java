package com.te.sequence_in_array;

import java.util.Iterator;

public class UserMainCode {

	static boolean searchSequence(int[] arr) {
		boolean result = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1)
				if (arr[i + 1] == 2)
					if (arr[i + 2] == 3)
						result = true;

		}
		return result;
	}
}
