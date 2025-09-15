

public class QuickSort {

    public static void quickSort(int [] arr, int low , int high){
        if(low < high)
        {
            int pivot_index = pivot_fun(arr ,low ,high);
            quickSort(arr, low, pivot_index-1);
            quickSort(arr, pivot_index+1, high);
        }
    }

    public static int pivot_fun(int[] arr , int low ,int high){
        int i = low;
        int j = high;
        int pivot = arr[low];

        while(i<j){
            while(arr[i] <= pivot && i<=high){
                i++;
            }
            while(arr[j] > pivot && j>=low){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
    public static void main(String [] args){
         int [] arr = {4,6,2,5,7,9,1,3};
         quickSort(arr, 0, arr.length-1);
         for(int i:arr){
            System.out.print(i+" ");
         }
    }
}
