

import java.util.ArrayList;
import java.util.List;

public class SuperReducedString {

    public static String superReducedString(String s) {
    // Write your code here
    List<Character> stack = new ArrayList<>();
    for(char ch : s.toCharArray()){
        int size = stack.size();
        if(size > 0 && stack.get(size-1) == ch){
            stack.remove(size-1);
        }
        else{
            stack.add(ch);
        }
    }
    StringBuilder sb = new StringBuilder();
    for(char ch : stack){
        sb.append(ch);
    }
    if(!sb.isEmpty()){
        return sb.toString();
    }
    return "";
    }
    public static void main(String[] args) {

        String s = superReducedString("aabbbccd");
        System.out.println(s);
    }
}
