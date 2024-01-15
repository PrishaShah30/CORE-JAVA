public class SelectionSortFunction {
    // Function to print the elements of the array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {7, 8, 3, 2, 1};
        
        // Selection Sort:
        // It assumes the first index of the array to be the smallest and checks 
        // the other elements to find a smaller number, replacing places when needed.
        // Time complexity: O(n^2)
        // Note: Selection Sort is not the most optimal sorting algorithm.
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            // Swapping elements to place the smallest in the correct position
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        // Printing the sorted array
        printArray(arr);
    }
}
