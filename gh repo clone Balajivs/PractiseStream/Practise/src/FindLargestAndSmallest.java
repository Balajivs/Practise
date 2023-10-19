
public class FindLargestAndSmallest {

	public static void main(String[] args) {
		int[] arr = { 12, 3, 45, 6, 21, 8, 9, 42, 7 };

		int smallest = arr[0]; // Initialize with the first element
		int largest = arr[0]; // Initialize with the first element

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < smallest) {
				smallest = arr[i];
			} else if (arr[i] > largest) {
				largest = arr[i];
			}
		}

		System.out.println("Smallest number: " + smallest);
		System.out.println("Largest number: " + largest);
	}
}
