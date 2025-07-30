

public class ReverseBits {
    public static int solution(int n){
        int result =0;
        for(int i =0;i<32;i++) {
            int LSB = n&1;
            result = (result<<1) | LSB;
            n=n>>>1;
        }
        return result;
    }
    public static void main(String args[]){
        System.out.println(solution(43261596));
    }
}
