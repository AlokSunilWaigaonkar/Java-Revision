

public class BreakingtheRecords {
    public static int [] solution(int arr []){
        int min = arr[0];
        int max = arr[1];
        int record [] = new int [2];
        for(int i =1;i<arr.length;i++){
            if(arr[i] < min){
                min= arr[i];
                record[1]++;
            }
            else if(arr[i]>max){
                max = arr[i];
                record[0]++;
                
            }
        }
        return record;
    }
    public static void main(String[] args) {
        int arr [] = {10 ,5 ,20 ,20 ,4 ,5 ,2 ,25 ,1};
        int result []  = solution(arr);
        for(int i =0;i<2;i++){
            System.out.println(result[i]);
        }
    }
}
