

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickPartition {
    public static List<Integer> quickSort(List<Integer> arr) {
    // Write your code here
        partition(arr,0,arr.size()-1);
        return arr;

    }
    
    public static void partition(List<Integer> arr , int startIndex , int endIndex){
        int pivot = arr.get(startIndex);
        int i = startIndex+1;
        for(int j=startIndex+1;j<=endIndex;j++){
            if(arr.get(j) < pivot){
                
                int temp = arr.get(i);
                arr.set(i,arr.get(j));
                arr.set(j,temp);
                i++;
            }
        }
        
        int temp =arr.get(i-1);
        arr.set(i-1,arr.get(startIndex));
        arr.set(startIndex, temp);
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(6, 3, 9, 5, 2, 8));
        
        List<Integer> result = quickSort(arr);
        for(int i:result){
            System.out.print(i);
        }
    }
}
