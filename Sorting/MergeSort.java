

public class MergeSort {
    public static void mergeSort(int arr[] , int startIndex ,int endIndex){
        if(startIndex >= endIndex){
            return;
        }
        int midIndex = startIndex + (endIndex - startIndex)/2;
        mergeSort(arr, startIndex, midIndex);
        mergeSort(arr, midIndex + 1, endIndex);
        merge(arr , startIndex , midIndex , endIndex);
    }
    public static void merge(int arr[],int startIndex , int midIndex , int endIndex){
        int i = startIndex;
        int j = midIndex + 1 ;
        int k =0;
        int temp [] = new int[endIndex - startIndex + 1];
        // Merge both halves into temp[]
        while(i<=midIndex && j <= endIndex){
            if(arr[i] < arr[j]){
                temp[k++] = arr[i++];

            }else{
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements of left half
        while(i<=midIndex){
            temp[k++] = arr[i++];
        }
        // Copy remaining elements of right half
        while(j<=endIndex){
            temp[k++] = arr[j++];
        }
        for(k=0 , i=startIndex;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String args[]){
        int arr[]={6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
