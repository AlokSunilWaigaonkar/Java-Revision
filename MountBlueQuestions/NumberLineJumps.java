

public class NumberLineJumps {
    public static String solution(int x1, int v1, int x2, int v2){
        if((x2 > x1 && v2 > v1) || (x1 > x2 && v1 > v2 )){
            return "NO";
        }
        return "YES";
    }
    public static void main(String[] args) {
        System.out.println(solution(0 ,3, 4, 2));
    }
}
