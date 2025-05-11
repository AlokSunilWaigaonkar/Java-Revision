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

    public static void prefixMaxSumSubArray(int [] array){
        int maxSum=0;
        int currSum=0;
        int [] prefix = new int[array.length];
        prefix[0] = array[0];
        for(int i=1;i<array.length;i++){
            prefix[i]=prefix[i-1]+array[i];
        }

        for (int i=0;i<array.length;i++){
            int start=i;
            for(int j=0;j<array.length;j++){
                int end=j;
                currSum = start ==0? prefix[end]: prefix[end]-prefix[start-1];
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println(maxSum);
    }



    public static void main(String args[]){
        int [] array = {-2,3,4,5,56};
        prefixMaxSumSubArray(array);
    }

}