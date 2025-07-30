package Sorting;

public class CountingSort {
    public static int [] countingSort(int [] arr){
        int max = Integer.MIN_VALUE;
        //finding max value
        for(int i=0;i<arr.length;i++){
            max=Math.max(arr[i], max);
        }

        //count array
        int [] count = new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //sorting based on frequency 
        int j=0;
        for(int i =0;i<count.length;i++){
            while(count[i]>0){
            arr[j] = i;
            j++;
            count[i]--;
        }
        }

        return arr;
    }

    public static void main(String[] args) {
        int [] arr = {5,4,1,3,2};
        int [] sortedArr=countingSort(arr);
        for(int i:sortedArr){
            System.out.print(i);
        }
    }
}
