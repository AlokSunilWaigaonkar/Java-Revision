
import java.util.ArrayList;
import java.util.List;



public class leetCode_2200 {
    public static List<Integer> solution(int[] nums, int key, int k){
        List<Integer> keyIndexList = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] == key ){
                keyIndexList.add(i);
            }
        }
        List<Integer> indexList = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            for(int j : keyIndexList){
                if(Math.abs((i-j)) <= k){
                    indexList.add(i);
                    break;
                }
            }
        }
        return indexList;
    }

    public static void main(String[] args) {
        int nums [] = {3,4,9,1,3,9,5};
        List<Integer> indices = solution(nums, 9, 1);
        for(int i : indices){
            System.out.println(i);
        }
    }
}
