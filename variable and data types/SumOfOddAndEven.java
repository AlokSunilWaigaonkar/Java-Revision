
import java.util.Scanner;

public class SumOfOddAndEven {
    public static void main(String args[]){
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int num = sc.nextInt();
        int a []=new int[num];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<num;i++){
            a[i]=sc.nextInt();
        }
        
        int sum1=0;
        int sum2=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                sum1=sum1+a[i];
            }
            else{
                sum2=sum2+a[i];
            }
        }
        System.out.println("Sum of even numbers is: "+sum1);
        System.out.println("Sum of odd numbers is: "+sum2);
    }
}
