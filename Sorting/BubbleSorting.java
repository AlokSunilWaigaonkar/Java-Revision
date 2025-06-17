package Sorting;

public class BubbleSorting {
    
    public static int[] bubbleSorting(int [] array){
        for(int turn = 0 ; turn < array.length-1 ; turn++){
            for(int j = 0 ; j < array.length - 1 -turn ; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1]= temp;
                }
            }
        }
        return array;
    }
    public static void main(String [] args){
        int arr [] = {5,4,1,3,2};
        int []sortedArray = bubbleSorting(arr);
        for(int i =0; i < sortedArray.length;i++){
            System.out.print(sortedArray[i]+" ");
        }
    }

}
