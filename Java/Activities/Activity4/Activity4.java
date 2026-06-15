package activities;

public class Activity4 {

    // Method to perform insertion sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move the elements greater than key, one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {22, 27, 16, 18, 100};

        System.out.println("Original Array:");
        printArray(numbers);

        insertionSort(numbers);

        System.out.println("\nSorted Array:");
        printArray(numbers);
    }
}
