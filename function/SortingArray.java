

public class SortingArray {
    public static void main(String args[]){
        int [] arr = {1,2,1,3,5,2,4,2};
        int count=0;
        for(int i =0;i<arr.length-2 ; i++){
                if(arr[i] + arr[i+2] == arr[i+1]){
                    System.out.println(arr[i]+" "+  arr[i+1] + " " +arr[i+2]);
                    count++;
                }
        }
        System.out.println(count);
    }
}
