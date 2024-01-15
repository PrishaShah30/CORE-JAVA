public class SortingQuick {
    // Function to partition the array and return the pivot index
    public static int partition(int a[], int low, int high) {
        int pivot = a[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (a[j] < pivot) {
                i++;
                // Swap
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        i++;
        // Swap pivot into its correct position
        int temp = a[i];
        a[i] = pivot;
        a[high] = temp;
        return i; // Pivot index
    }

    // Recursive function to perform quicksort
    public static void quicksort(int a[], int low, int high) {
        if (low < high) {
            int pidx = partition(a, low, high);
            // Recursively sort the partitions
            quicksort(a, low, pidx - 1);
            quicksort(a, pidx + 1, high);
        }
    }

    public static void main(String args[]) {
        int a[] = {6, 3, 9, 5, 2, 8};
        int n = a.length;

        quicksort(a, 0, n - 1);

        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
