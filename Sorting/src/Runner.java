import java.util.Arrays;

public class Runner {
	public static void main(String[] args) {
		int [] originalArr = {78,34,1,23,9,0};
		System.out.println("Before sorting => "+Arrays.toString(originalArr));
		
		int [] arr = Arrays.copyOf(originalArr, originalArr.length);
		SelectionSort.sort(arr);
		System.out.println("Selection sort => "+Arrays.toString(arr));
		
		arr = Arrays.copyOf(originalArr, originalArr.length);
		BubbleSort.sort(arr);
		System.out.println("Bubble sort => "+Arrays.toString(arr));
			
		arr = Arrays.copyOf(originalArr, originalArr.length);
		InsertionSort.sort(arr);
		System.out.println("Insertion sort => "+Arrays.toString(arr));
		
		arr = Arrays.copyOf(originalArr, originalArr.length);
		MergeSort mergeSort = new MergeSort();
		mergeSort.mergeSort(arr,0,arr.length-1);
		System.out.println("Merge sort => "+Arrays.toString(arr));
	}
}
