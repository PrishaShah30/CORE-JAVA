public class SortingQuick {
    public static int partition(int a[], int low, int high){
        int pivot = a[high];
        int i= low-1;
        for(int j=low; j<high; j++){
            if(a[j]<pivot){
                i++;
                //swap
                int temp =a[i];
                a[i] = a[j];
                a[j]=temp;
            }
        }
        i++;
        int temp=a[i];
        a[i]=pivot;
        a[high]=temp;
        return i; // pivot index

    }
    public static void quicksort(int a[], int low, int high ){
       if(low<high){
        int pidx = partition(a, low, high);
        quicksort(a,low,pidx-1);
        quicksort(a,pidx+1,high);
       }
    }
    public static void main(String args[]){
        int a[] = {6,3,9,5,2,8};
        int n= a.length;

        quicksort(a,0,n-1);
        //print 
        for(int i=0; i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
