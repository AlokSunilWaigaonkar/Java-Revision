

public class Anagrams {
    public static boolean isAnagram(String str1 , String str2){
        int count[] = new int[26];
        if(str1.length() != str2.length()){
            return false;
        }
        for(int i=0;i<str1.length();i++){
            count[str1.charAt(i) - 'a']++;
            count[str2.charAt(i) - 'a']--;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("race", "car"));
    }
}
