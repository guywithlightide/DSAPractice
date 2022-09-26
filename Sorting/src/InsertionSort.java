
public class InsertionSort {
	public static int [] sort(int [] arr) {
		for (int step = 1; step < arr.length; step++) {
			int key = arr[step];
			int j = step-1;
			while (j>=0 && key<arr[j]) {
				arr[j+1] = arr[j];
				--j;
			}
			arr[j+1] = key;
		}
		return arr;
	}
}
