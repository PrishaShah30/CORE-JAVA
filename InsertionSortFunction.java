public class InsertionSortFunction {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {7,8,3,1,2};
        // insertion sort 
        // it is going to divide the the array into two peices, one will be the sorted one and the other would be 
        // unsorted part so for let's assume 7 is sorted and rest isn't so we keep checking one after the other with 
        // the unsorted part as in we check if 7 is greter or not if not then make a space for 8 then acc keep doing it 
        // keep making spaces as you enter a digit from the unsorted to sorted and then place them in their right place 
        // untill the unsorted portion is empty !
        // time complexity is Big O(n^2) so even this sorting type is not the optimal 
        for(int i=1; i<arr.length;i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current <arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            //placement
            arr[j+1]=current;
        }
        printArray(arr);
    }
}
