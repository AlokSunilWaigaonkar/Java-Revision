

public class leet_215 {

    public static int solution(int [] arr ,int low ,int high , int k){
        if(low == high){
            return arr[low];
        }

        int pivotIndex = pivotFun(arr, low, high);

        if(pivotIndex < k){
            
        }
        
        return -1;
    }
    public static int pivotFun(int [] arr , int low ,int high){
        int i = low;
        int j = high;
        int pivot = arr[low];

        while(i<j){
            while(arr[i] > pivot && i<=high){
                i++;
            }
            while(arr[j] <= pivot && j>=low){
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
    
    public static void main(String[] args) {
        int [] arr = {3,2,1,5,6,4};
        int result = solution(arr, 0, arr.length-1);
        System.out.println(result);

    }
}
