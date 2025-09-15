
import java.util.ArrayList;
import java.util.List;

public class SubSet {

    public static void subsetWithoutDupli (int [] nums , int index, List<Integer> result,List<List<Integer>> ans){
        
        ans.add(new ArrayList<>(result));
        for(int i =index;i<nums.length;i++){
            if(i>index && nums[i] == nums[i-1])continue;
            result.add(nums[i]);
            subsetWithoutDupli(nums, i+1, result, ans);
            result.remove(result.size()-1);
        }
        
    }
    public static void main(String[] args) {
        int nums[] = {1,2,2};
        List<Integer> result= new ArrayList<>(); 
        List<List<Integer>> ans = new ArrayList<>();
        subsetWithoutDupli(nums, 0, result, ans);
        System.out.println(ans);
    }
}
