public class SelectionSortFunction {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {7,8,3,2,1};
        // selection sort 
        // it'll assume the first index of the array to be the smallest and the check of the other elements if
        // there is some other number smaller than assumed then it'll replace places with it 
        // time complexity Big O(n^2) 
        // even this is not an optimal sorting to use 
        for(int i=0; i<arr.length-1;i++){
            int smallest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        printArray(arr);
    }
}
