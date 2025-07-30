
public class SumPairs {
    public static int divisibleSumPairs(int n, int k, int[] ar) {
    // Write your code here
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((ar[i]+ar[j])%k==0){
                    System.out.println(ar[i]+" "+ar[j]);
                    System.out.println( i + " " + j);
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int ar [] = {1, 3, 2, 6, 1, 2};
        divisibleSumPairs(6, 3, ar);
    }
}
