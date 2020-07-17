package fundamental;

import java.util.*;

public class BinarySearch {

	// returns index where element found
	
	
	// Recursive implementation
	private static int binarySearchRec(int a[], int low, int high, int key) {
		if(low>high)return -1;  // element not found
		
		int mid=(low+high)/2;
		
		if(a[mid]==key)return mid;
		else if (a[mid]>key) return binarySearchRec(a, low, mid-1, key);
		return binarySearchRec(a, mid+1, high, key);
	}
	
	
	// Iterative implementation
	private static int binarySearchItr(int a[],int low, int high, int key) {
		while(low<=high) {
			int mid=(low+high)/2;
			if(a[mid]==key) return mid;
			else if(a[mid]>key) high=mid-1;
			else low=mid+1;	
		}
		return -1;
	}
	
	// Method to print Array
	private static void printArray(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) throws Exception {
		int a[]= {3,4,6,8,9,1,0,11,14};
		Arrays.sort(a);
		
		printArray(a);
		System.out.println("Search 11: "+binarySearchRec(a, 0, a.length-1, 11));
		System.out.println("Search 11: "+binarySearchItr(a, 0, a.length-1, 11));
		System.out.println("Search 11: "+Arrays.binarySearch(a, 11));
		
		System.out.println("Search 100: "+binarySearchRec(a, 0, a.length-1, 100));
		System.out.println("Search 100: "+binarySearchItr(a, 0, a.length-1, 100));
		System.out.println("Search 100: "+Arrays.binarySearch(a, 100));
		
	}

}
