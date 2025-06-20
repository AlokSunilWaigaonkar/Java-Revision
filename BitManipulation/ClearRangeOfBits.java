
public class ClearRangeOfBits {
    public static int solution(int num , int i , int j){
        int a = (-1)<<j+1;
        int b = (1<<i)-1;
        int bitMask = a|b;
        return num & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(solution(10, 2, 4));
    }
}
