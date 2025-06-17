package Sorting;

import java.util.Random;

public class SelectionSort {
    //Normal Selection sort
    public static int [] selectionSort(int [] arr){
        for(int i =0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            int temp = arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }

    public static int[] generateRandomArray(int size){
        Random random = new Random();
        int arr [] = new int[size];
        for(int i = 0; i<size;i++){
            arr[i] = random.nextInt(size);
        }
        return arr;
    }

    public static void displayArray(int [] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        int arr [] = generateRandomArray(1000);
        int [] soretedArray = selectionSort(arr);
        displayArray(soretedArray);
     }
}
