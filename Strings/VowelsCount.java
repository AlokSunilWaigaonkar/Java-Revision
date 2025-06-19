//Count how many times lowercase vowels occurred in a String entered by the user
public class VowelsCount {
    public static int vowelsCount(String str){
        int count =0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' ){
                count ++;
            }
        }
        return count ;
    }
    public static void main(String[] args) {
        String str = "Hello , I am Alok";
        System.out.println(vowelsCount(str));
    }
}
