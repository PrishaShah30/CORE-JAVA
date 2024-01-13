public class BubbleSortingFunction {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {7,8,3,1,2};
        // time complexity = Big O(n^2)
        // not a good sorting time  
        //bubble sort = ascending order 
        // it'll take a loop then will check from the whole array pair by pair and keep the largest number at last
        // after which will take a second run untill all the number's are in an ascending order 
        for(int i=0; i<arr.length-1;i++){ // 
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap now 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }
}
