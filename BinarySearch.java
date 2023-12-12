 

import java.io.*;

class BinarySearch {

	
	int binarySearch(int arr[], int x)
	{
		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;

			
			if (arr[m] == x)
				return m;

			
			if (arr[m] < x)
				l = m + 1;

			
			else
				r = m - 1;
		}

		
		return -1;
	}

	
	public static void main(String args[])
	{
		BinarySearch ob = new BinarySearch();
		int arr[] = { 22, 33, 4, 30, 10 };
		int n = arr.length;
		int x = 10;
		int result = ob.binarySearch(arr, x);
		if (result == -1)
			System.out.println(
				"Element is not present in array");
		else
			System.out.println("Element is present at "
							+ "index " + result);
	}
}

 


