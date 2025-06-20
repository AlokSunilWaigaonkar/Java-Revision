
public class ClearLastIBits {

    public static int solution(int num , int i){
        int bitMask = (-1) << i;
        return num & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(solution(15, 2));
    }
}
