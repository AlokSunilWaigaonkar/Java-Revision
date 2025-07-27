
public class Counting {

    public  static void count(int n){
        if(n == 3){
            return;
        }
        System.out.println(n);
        count(n+1);

    }

    public static void main(String[] args) {
        count(0);
    }
}
