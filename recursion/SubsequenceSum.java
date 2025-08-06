import java.util.ArrayList;
import java.util.List;

public class SubsequenceSum {

    public static boolean solution(int idx, List<Integer> result, int sum, int[] arr, int k) {
        // Base case: if we have considered all elements
        if (idx == arr.length) {
            // If the current subsequence's sum matches target k
            if (sum == k) {
                System.out.println(result);
                return true;
            }
            return false;
        }

        // Include current element
        result.add(arr[idx]);
       if( solution(idx + 1, result, sum + arr[idx], arr, k) == true) return true;

        // Backtrack and exclude current element
        result.remove(result.size() - 1);
        if(solution(idx + 1, result, sum, arr, k)==true)return true;

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int k = 2;
        List<Integer> result = new ArrayList<>();
        solution(0, result, 0, arr, k);
    }
}