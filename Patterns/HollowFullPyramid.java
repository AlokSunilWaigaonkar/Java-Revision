public class HollowFullPyramid {
    /*
            * 
          *   * 
        *       * 
      *           * 
    * * * * * * * * *

     */
    public static void main(String[] args) {
        int rows = 5;
        for(int i =0 ;i<rows;i++){
            for(int j=0; j<rows-i-1;j++){
                System.out.print("  ");
            }
            for(int k=0;k<2*i+1;k++){
                if(i == rows-1){
                    System.out.print("* ");
                }
                else if(k==0 || k == 2*i ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                
            }
                System.out.println();
        }
    }
}
