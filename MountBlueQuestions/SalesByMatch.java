
import java.util.HashMap;
import java.util.Map;



public class SalesByMatch {
    public static int solution(int n , int arr[]){
        Map<Integer,Integer> map  = new HashMap<>();
        for(int i =0;i<n;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }
            else{
                int count = map.get(arr[i]);
                map.put(arr[i], count+1);
            }
        }
        int pairs =0;
        for(int sockCount : map.values()){
            pairs = pairs + sockCount/2;
        }
        return pairs;
    }
    public static void main(String[] args) {
        int arr [] = {10, 20, 20, 10, 10, 30, 50, 10, 20} ;
        System.out.println(solution(9, arr));
    }
}
