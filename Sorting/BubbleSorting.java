package Sorting;

import java.util.Arrays;
import java.util.Random;

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

    public static int [] OptimizedBubbleSort(int [] arr){

        int n = arr.length;
        
        for(int turn = 0 ; turn<n-1;turn++){
            boolean swap = false;
            for(int i =0;i<arr.length-1-turn;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swap=true;
                }
            }
            if(!swap){
                break;
            }

        }

        return arr;
    }
    public static int[] LengthOptimizedBubbleSort(int [] arr){
        int n=arr.length;
        while(n>1){
            int newn=0;
            for(int i = 0 ; i< n-1;i++){
                if (arr[i] > arr[i + 1]) {
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    newn = i + 1;
                }
            }
            n = newn;
            
        }
        return arr;
    }

    public static int [] generateRandomArray(int size){
        Random random = new Random();
        int arr[]= new int[size];
        for(int i = 0 ; i<size-1;i++){
            arr[i] = random.nextInt(size);
        }
        return arr;
    }

    public static void benchmark() {
        long totalOptimized = 0;
        long totalNormal = 0;
        long totalLengthOpitmized=0;
        int runs = 10;
    
        for (int i = 0; i < runs; i++) {
            int[] arr = generateNearlySortedArray(10000);
    
            int[] arr1 = Arrays.copyOf(arr, arr.length);
            int[] arr2 = Arrays.copyOf(arr, arr.length);
    
            long start1 = System.nanoTime();
            OptimizedBubbleSort(arr1);
            long end1 = System.nanoTime();

            long start3 = System.nanoTime();
            LengthOptimizedBubbleSort(arr);
            long end3 = System.nanoTime();

            long start2 = System.nanoTime();
            bubbleSorting(arr2);
            long end2 = System.nanoTime();
    
            totalOptimized += (end1 - start1);
            totalLengthOpitmized+=(end3-start3);
            totalNormal += (end2 - start2);
        }
    
        System.out.println("Average Optimized time: " + (totalOptimized / runs) + " ns");
        System.out.println("Average Length Optimzied time: "+(totalLengthOpitmized/runs+"ns"));
        System.out.println("Average Normal time:    " + (totalNormal / runs) + " ns");
    }

        public static int[] generateNearlySortedArray(int size) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = i;
            }
            // Introduce a few random swaps
            Random rand = new Random();
            for (int i = 0; i < 10; i++) {
                int a = rand.nextInt(size);
                int b = rand.nextInt(size);
                int temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
            }
            return arr;
        }

    public static void main(String [] args){
        benchmark();
    }

}
