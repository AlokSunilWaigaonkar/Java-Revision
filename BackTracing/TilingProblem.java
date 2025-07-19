public class TilingProblem {
    public static int solution(int n){

        // Base Case 
        if(n ==0 || n==1 ){
            return 1 ;
        }

        //kaam 
        //vertical choice 
        int fnm1 = solution(n-1);
        
        // Horizontal Choice
        int fnm2 = solution(n-2);

        int totalWays = fnm1 + fnm2;
        return totalWays;

    }

    public static void main(String[] args) {
        int result = solution(4);
        System.out.println(result);
    }
}
