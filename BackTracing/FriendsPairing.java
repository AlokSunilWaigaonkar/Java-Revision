public class FriendsPairing {
    public static int solution(int n){
        // Base Case 
        if(n==1){
            return 1;
        }
        if(n== 2){
            return 2 ;
        }
         // Cases
         int Singles = solution(n-1);
         int Pairs = (n-1) * solution(n-2);
           
         int totalWays = Singles + Pairs;
         return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(solution(5));
    }
}
