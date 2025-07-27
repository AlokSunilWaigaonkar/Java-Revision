

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
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
       int result [] =  NormalReversal(arr);
       for(int i : result){
        System.out.println(i);
       }
    }
}