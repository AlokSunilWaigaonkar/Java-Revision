import java.util.*;

public class ReverseOfNumber {
    public static void main(String args[]){
        // In a program, input a number and output the reverse of that number.
        // For example, if the input is 12345, the output should be 54321.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int num1 = num;
        int reverse  = 0;
        while(num !=0){
            int remainder= num % 10;
            reverse = (reverse*10)+remainder;
            num = num/10;
        }
        System.out.println("Reverse of number " + num1 +" is "+reverse);
            }
}
