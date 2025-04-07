
import java.util.*;

public class PrimeOrNot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do{
        int num = sc.nextInt();
        boolean isPrime = true;
        for(int i=2;i<num-1;i++){
            if(num%i==0){
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println("Prime Number");
        }else{
        System.out.println("Not Prime Number");
        }
    }while(true);
    }
}
