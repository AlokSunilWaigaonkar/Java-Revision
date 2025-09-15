package leetCode;

import java.util.ArrayList;

public class LeetCode_9{
    public static boolean  isPalindrome(int x) {
        String str = Integer.toString(x);
        char ch [] = str.toCharArray();
        int n = ch.length;

        for(int i =0;i<n;i++){
            if(ch[i] != ch[n-1-i]){
                
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int n = 1000021;
        System.out.println(isPalindrome(n));
    }
}