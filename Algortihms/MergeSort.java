

public class MergeSort {

    public static void mergeSort(int arr[]){
        int low=0;
        int high = arr.length-1;
        int [] temp = new int[arr.length];
        divideMerge(arr,low,high,temp);
    }

    public static void divideMerge(int [] arr , int low , int high,int [] temp){
        if(low >= high ){
            return;
        }
        int mid = (low + high)/2;
        divideMerge(arr, low, mid,temp);
        divideMerge(arr, mid+1, high,temp);
        merge(arr,low,mid,high,temp);
    }

    public static void merge(int [] arr, int low , int mid , int high,int [] temp){
        int left = low;
        int right = mid+1;
        int k =low;
        while(left<=mid && right<=high){
            if(arr[left] <= arr[right]){
                temp[k++] = arr[left++];
            }
            else{
                temp[k++] = arr[right++];
            }
        }
        while(left<=mid){
            temp[k++] = arr[left++];
        }
        while(right<=high){
            temp[k++] = arr[right++];
        }
        for(int i = low;i <= high;i++){
            arr[i] = temp[i];
        }
    }
    public static void main(String[] args) {
        int [] arr = {3,1,2,4,1,5,2,6,4};
        mergeSort(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
