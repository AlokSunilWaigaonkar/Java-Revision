
import java.util.Arrays;


public class leetCode_2040 {
    public static int solution(int nums1[] , int nums2[],int k){
        int [] result = new int[nums1.length * nums2 .length];
        int l=0;
        for(int i =0;i<nums1.length;i++ ){
            for(int j =0;j<nums2.length;j++){
                result[l++] = nums1[i]*nums2[j]; 
            }
        }
        Arrays.sort(result);
        return result[k-1];

    }
    public static void main(String[] args) {
        int [] nums1 = {-2,-1,0,1,2};
        int [] nums2 = {-3,-1,2,4,5};
        int k =3;
        int result = solution(nums1, nums2, k);
        System.out.println(result);
    }
}
