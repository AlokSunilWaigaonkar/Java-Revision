
import java.util.ArrayList;

public class SubSequenceSum {

    public static boolean solution(int idx , int k  , ArrayList<Integer> result , int sum , int [] arr){
        if(idx == arr.length){
            if(sum==k){
                System.out.println(result);
                return true;
            }
            return false;
        }
        result.add(arr[idx]);
        sum+=arr[idx];
        // take the element
        if(solution(idx+1,k, result, sum, arr)==true) return true;

        sum-=arr[idx];
        result.remove(result.size()-1);
        
        // not take the element
        if(solution(idx+1,k, result, sum, arr)) return true;
        return false;
    }
    public static void main(String args[]){
        int [] arr = {1,2,1};
        ArrayList<Integer> result = new ArrayList<>();
        int sum =0;
        solution(0,2, result, sum, arr);
    }
}
