

public class ReverseArray {

    /**
     * this function does the reversal of an array using for loop .
     * @param arr original arr.
     * @return changes the array using swapping and return the same array but changed.
     */
    public static int[] NormalReversal(int [] arr){
        int i =0;
        int j =arr.length-1;
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
        return arr;
    }


    /**
     * this function uses recursion to reverse an array
     * @param arr array to be reversed
     * @param i left pointer
     * @param j right pointer
     */
    public static void recursionReversal(int [] arr , int i ,int j){
        if(i>=j){
            return ;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        recursionReversal(arr, i+1, j-1);
    }

    /**
     * this funtion reverse an array using recurion but only one varaible
     * @param arr Array to be reversed
     * @param i Pointer for swapping
     */
    public static void recursionReversal(int [] arr , int i){
        int n= arr.length;
        if(i>= n/2){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp ;
        recursionReversal(arr, i+1);
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        // NormalReversal(arr);
        // recursionReversal(arr, 0, arr.length-1);
        recursionReversal(arr, 0);
       for(int i : arr){
        System.out.println(i);
       }

    }
}