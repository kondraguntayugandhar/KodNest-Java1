class ArraySearch {
	void search(int ref[], int key) {
		boolean found = false;
		for (int i = 0; i <= ref.length - 1; i++) {
			if (ref[i] == key) {
				System.out.println("Element found at index : " + i);
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Elements are not found ");
		}
	}
}

public class arr4 {
	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50};
		ArraySearch sc = new ArraySearch();
		sc.search(arr, 30);
	}
}
