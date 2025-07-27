
public class Summation {



    /**
     * This funciton return the summation of the number using parametersized recursion
     * @param i the number for summation 
     * @param sum start from zero
     */
    public static void summation(int i , int sum ){
        if(i < 1){
            System.out.println(sum);
            return ;

        }
        summation(i-1, sum+i);
    }
    public static void main(String [] args){
        summation(3, 0);
    }

}
