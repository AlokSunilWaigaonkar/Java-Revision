
public class SummationFunctional {

    /**
     * this function does the summation of the n number using funcitonal recursion
     * @param n number to be summed up 
     * @return the summation of the number 
     */
    public static int  summation(int n){
        if(n<1){
            return 0;
        }
        return n + summation(n-1);
    }

    public static void main(String [] args){
      int result =   summation(3);
      System.out.println(result);
    }
}
