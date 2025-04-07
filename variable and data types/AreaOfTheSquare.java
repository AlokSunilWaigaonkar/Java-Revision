// In a program,input the side of a square.You have to output the area of the square.
import java.util.*;
public class AreaOfTheSquare {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of square");
        int side = sc.nextInt();
        int area = side*side;
        System.out.println("Area of the square with side "+side+" is "+area);
        sc.close();
    }
}
