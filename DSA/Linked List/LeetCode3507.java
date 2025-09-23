import java.util.LinkedList;
public class LeetCode3507 {
    public static LinkedList<Integer> ll = new LinkedList<Integer>();
    public static  int minimumPairRemoval(int[] nums) {
        int count =0;
        convertIntoLL(nums);
        
        while(!isSorted()){
            int min = Integer.MAX_VALUE;
            int loc = 0;
            for(int i =0;i<ll.size()-1;i++){
                if(ll.get(i) + ll.get(i+1) < min)
                {   
                    min = ll.get(i) + ll.get(i+1);
                    loc = i;
                    
                }
            }
            System.out.println(min);
            ll.remove(loc+1);
            ll.remove(loc);
            ll.add(loc,min);
            count++;
            System.out.println(ll);
        }
        return count;

    }
    public static void convertIntoLL(int [] nums){
        for(int num : nums){
            ll.addLast(num);
        }
    }
    public static boolean isSorted(){
        for(int i =0;i<ll.size()-1;i++){
            if(ll.get(i) > ll.get(i+1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String [] args){
        int [] nums = {-2,1,2,-1,-1,-2,-2,-1,-1,1,1};
        System.out.println(minimumPairRemoval(nums));
    }
}
