
public class QuickSort {

    public static void quickSort(int arr[], int startIndex , int endIndex){
        if(startIndex >= endIndex){
            return;
        }
        int pivotIndex = partition(arr, startIndex, endIndex);
        quickSort(arr, startIndex, pivotIndex-1);
        quickSort(arr, pivotIndex+1, endIndex);
    }

    public static int partition(int arr[],int startIndex,int endIndex){
        int pivot = arr[endIndex];
        int i = startIndex-1;
        for(int j = startIndex;j<endIndex;j++){
            if(arr[j]<= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[endIndex] = arr[i];
        arr[i]= temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        quickSort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
