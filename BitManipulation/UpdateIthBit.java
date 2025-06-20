

public class UpdateIthBit {
    public static int solution(int num , int i , int update){
        num = ClearIthBit.solution(num, i);
        int bitMask = update << i;
        return num | bitMask;
    }
    public static void main(String[] args) {
        System.out.println(solution(6, 1, 0));
    }
}
