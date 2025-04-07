import java.util.*;


public class Bill {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of pencil:");
        float pencilP = sc.nextFloat();
        System.out.println("Enter the price of pen:");
        float penP = sc.nextFloat();
        System.out.println("Enter the price of eraser:");
        float eraserP = sc.nextFloat();
        float total = pencilP+penP+eraserP;
        System.out.println("Total price of pencil, pen and eraser is "+total+" Rs .");
        float amount = total + ((total*18)/100);
        System.out.println("The amount paid after GST :"+ amount+" Rs");


    }
}
