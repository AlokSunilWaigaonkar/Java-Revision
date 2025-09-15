
import java.util.ArrayList;
import java.util.List;

public class SubsetSum {
    public static void subsetSum(int [] nums , int sum , int index , List<Integer> subSetSum){
        if(index == nums.length){
            subSetSum.add(sum);
            return;
        }

        subsetSum(nums, sum+nums[index], index+1, subSetSum);

        subsetSum(nums,sum,index+1,subSetSum);
    }

    public static void main(String[] args) {
        int [] nums = {3,1,2};
        List<Integer> subSetSum = new ArrayList<>();
        subsetSum(nums, 0, 0, subSetSum);
        System.out.println(subSetSum);
    }
}
