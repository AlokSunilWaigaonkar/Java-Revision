public class InvertedFullPyramid {
    /* 
     Input: rows = 5

* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 

     */
    public static void main(String[] args) {
        int rows = 5;
        for(int i=0;i<rows;i++){
            for(int j =0; j<i ;j++){
                System.out.print("  ");
            }

            for(int k = 0 ;k<2*(rows-i)-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
