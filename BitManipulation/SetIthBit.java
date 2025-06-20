

public class SetIthBit {
    public static int solution(int num , int i){
        int bitMask = 1<<i;
        System.out.println("Number after setting "+ i +" th bit");
        return num|bitMask;
    }
    public static void main(String[] args) {
        System.out.println(solution(6, 0));
    }
}
