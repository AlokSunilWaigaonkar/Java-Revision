
import java.util.ArrayList;
import java.util.List;

public class Subsequences {

    public static void solution(int idx , List<Integer> result,int[]arr){
        if(idx == arr.length){
            System.out.println(result);
            return;
        }
        // take condition 
        result.add(arr[idx]);
        solution(idx+1, result, arr);
        result.remove(result.size()-1);
        // not take condition 
        solution(idx+1, result, arr);
    }
    public static void main(String[] args) {
        int [] arr = {3,1,2};
        List<Integer> result = new ArrayList<>();
        solution(0, result, arr);
        }
}
