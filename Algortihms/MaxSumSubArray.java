public class MaxSumSubArray {


    public static void maxSumSubArray(int [] array){
        int currSum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            int start=i;
            for(int j=i;j<array.length;j++){
                int end=j;
                currSum=0;
                for(int k= start;k<=end;k++){
                    currSum+=array[k];
                }
                System.out.println("Currrent Sum"+currSum);
                if(maxsum<currSum){
                    maxsum=currSum;
                }
            }
        }
        System.out.println("Maximum sum:"+maxsum);
    }




    public static void main(String args[]){
        int [] array = {-2,3,4,5,56};
        maxSumSubArray(array);
    }

}