import java.util.Arrays;

public class FindKthLargestElement {

	public static void main(String[] args) {
		int[] arr = { 12, 3, 45, 6, 21, 8, 9, 42, 7 };
		int k = 3; // Replace with the desired value of K

		int kthLargest = findKthLargest(arr, k);

		System.out.println("The " + k + "th largest element is: " + kthLargest);
	}

	public static int findKthLargest(int[] arr, int k) {
		Arrays.sort(arr); // Sort the array in ascending order
		int n = arr.length;

		// The Kth largest element is at index (n - k)
		return arr[n - k];
	}
}
