
public class BinaryToDecimal {
   
   public static double ConvertBinaryToDecimal(int binary ) {
     int lastDigit=0;
     double decimal = 0 ;
     int pow=0;
     while(binary!=0){
      lastDigit = binary %10;
      decimal = decimal + (Math.pow(2, pow)*lastDigit);
      binary = binary/10;
      pow++;
     }
     return decimal;
   }

   public static void main(String[] args) {
      System.out.println("Decimal is :" + ConvertBinaryToDecimal(101));
   }
}