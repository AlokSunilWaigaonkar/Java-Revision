
public class DescBackTracking {


    public static void printDesc(int i , int n){
        if(i>n){
            return;
        }
        printDesc(i+1, n);
        System.out.print(i  + " ");
    }
    public static void main(String [] args){
        printDesc(1, 25);
    }
}
