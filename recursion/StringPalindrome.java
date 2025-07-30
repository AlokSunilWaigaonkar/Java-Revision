

public class StringPalindrome {
    

    /**
     * Normal funciton which  tells if the string is pallindrome or not
     * @param str String 
     * @return returns the boolean true or false
     */
    public static boolean isPalindrome(String str){
        int i =0;
        int n = str.length();
        
        while(i<=n-1){
            
            if(str.charAt(i)!=str.charAt(n-1)){
                return false;
            }
            i++;
            n--;
        }
        return true;
    }

     public static boolean recursivePalindrome(int i , String str){
        if(i>=str.length()/2) return true;
        if(str.charAt(i) != str.charAt(str.length()-i-1)) return false;
        return recursivePalindrome(i+1, str);
     }

    public static void main(String args []){
        System.out.println(recursivePalindrome(0, "madam"));
    }

}
