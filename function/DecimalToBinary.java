import java.util.*;

public class DecimalToBinary {

    public static int decimalToBinary(int num){
        int binary =0;
        int i=0;
        while(num>0){
            int remainder = num%2;
             num = num/2;
            binary = binary +  remainder * (int) Math.pow(10, i);
            i++;
        }
        return binary;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int decimal = sc.nextInt();
        int binary = decimalToBinary(decimal);
        System.out.println("Binary representation of "+decimal+" is "+binary);
        sc.close();
    }
}
