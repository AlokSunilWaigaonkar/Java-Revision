

import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List <Integer> result = new ArrayList<>();
        result.add(0);
        result.add(0);
        int aCount =0;
        int bCount =0;
        
        for(int i=0;i<3;i++){
            if(a.get(i) < b.get(i)){
                bCount++;
                result.set(1,bCount);
            }
            else if(a.get(i) > b.get(i)){
                aCount++;
                result.set(0,aCount);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        //17 28 30

        //99 16 8
        a.add(17);
        a.add(28);
        a.add(30);
        b.add(99);
        b.add(16);
        b.add(8);
        List<Integer> result = compareTriplets(a, b);
        for(int i :result){
            System.out.println(i);
        }

    }
}
