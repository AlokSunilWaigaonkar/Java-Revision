
public class FastExpo {
    static final long MOD = 1_000_000_007;
    public static long solution(long num , int expo){
        
        long ans =1;
        while(expo>0){
            if((expo & 1)!=0){
                ans = (ans * num) % MOD ;
            }
            num = (num * num) % MOD ;
            expo = expo >>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(solution(2, 100));
    }
}
