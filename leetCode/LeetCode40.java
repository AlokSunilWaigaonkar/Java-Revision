import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode40 {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> result = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        solution(candidates,target,result,0,ans);
        return ans;
    }
    public static void solution(int [] candidates , int remaining, List<Integer> result , int index,List<List<Integer>> ans){
        if(remaining == 0 ){
            ans.add(new ArrayList<>(result));   
        }
        for(int i=index;i<candidates.length;i++){
            if(i> index && candidates[i]==candidates[i-1])continue;
            if(candidates[i]>remaining)break;

            result.add(candidates[i]);
            solution(candidates,remaining - candidates[i],result,i+1,ans);
            result.remove(result.size()-1);
        }
        
    }

    public static void main(String[] args) {
        int [] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> ans =  combinationSum2(candidates,target);
        System.out.println(ans);

    }
}
