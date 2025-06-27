

public class OnArrays {
    public static void insertInArray(int [] arr , int i,int numStart){
        if(i == arr.length){
            printArr(arr); // arr on finish of recursion 
            return;
        }
        arr[i] = numStart;
        insertInArray(arr, i+1, numStart+1); // recursion 
        arr[i] = arr[i]-2; // backtracking step 
    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr [] = new int[5];
        insertInArray(arr, 0, 1);
        printArr(arr);
    }
}
