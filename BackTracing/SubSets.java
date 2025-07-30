
public class SubSets {
    public static void subSets(String str , String ans , int i){
        if(i == str.length()){
            System.out.println(ans);
            return;
        }
        subSets(str, ans+str.charAt(i), i+1);
        subSets(str, ans, i+1);
    }
    public static void main(String[] args) {
        subSets("abcd", "", 0);
    }
}
