public class TrappedRainwater{

    public static int trappedRainWater(int [] buildingHeight){
        //calcualte lefmaxarray
        int [] leftMaxArray = new int[buildingHeight.length];
        leftMaxArray[0] = buildingHeight[0];
        for( int i = 1 ; i < leftMaxArray.length ; i ++ ){
            leftMaxArray[i] = Math.max(buildingHeight[i], leftMaxArray[i-1]);
        }
        //calculate rightmaxarray
        int [] rightMaxArray = new int[buildingHeight.length];
        rightMaxArray[buildingHeight.length-1] = buildingHeight[buildingHeight.length-1];
        for ( int i = buildingHeight.length -2 ;i >=0 ;i-- ){
            rightMaxArray[i] = Math.max(rightMaxArray[i+1], buildingHeight[i]);
        }
        //calculate trapped rainwater 
        int trappedRainWater = 0;
        for(int i =0 ; i < buildingHeight.length ; i++ ){
            trappedRainWater += Math.min(rightMaxArray[i], leftMaxArray[i]) - buildingHeight[i];
        }
        return trappedRainWater;
    }

    public static void main(String args[]){
        int buildingHeight [] = {4,2,0,6,3,2,5};
        int trappedRainWater = trappedRainWater(buildingHeight); 
        System.out.println(trappedRainWater);
    }
}