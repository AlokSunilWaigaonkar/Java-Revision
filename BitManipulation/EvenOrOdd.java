

public class EvenOrOdd {
    public static void solution(int n){
        if((n & 1) !=0){
            System.out.println("Odd");
        }else{
            System.out.println("even");
        }
        
    }
    public static void main(String[] args) {
        solution(3);
    }
}
