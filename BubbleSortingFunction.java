public class BubbleSortingFunction {
    // Function to print the elements of an array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {7, 8, 3, 1, 2};

        // Bubble Sort:
        // Time complexity: O(n^2)
        // Not the most efficient sorting algorithm, but simple to understand
        // Bubble sort works by repeatedly stepping through the list, comparing each
        // pair of adjacent elements, and swapping them if they are in the wrong order.
        // The pass through the list is repeated until the list is sorted.

        // Ascending order using Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        printArray(arr);
    }
}
