import java.util.*;
// In a program,input 3 numbers:A,B and C.You have to output the average of these 3 numbers.
public class Average{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int average = (A+B+C)/3;
        System.out.println("Average of "+A+","+B+" and "+C+" is "+average);
        sc.close();
    }
}