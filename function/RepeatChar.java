public class RepeatChar {


    public static void  solution(String str){
        int [] index = new int[26];
        char [] charArray = str.toCharArray();
        for(int i=0;i<charArray.length;i++){
            if(index[charArray[i]- 'a']>0){
                continue;
            }
            index[charArray[i]-'a'] = i+1;
        }
        for(int i=0;i<charArray.length;i++){
            for(int j=0;j<index[charArray[i]-'a'];j++){
                System.out.print(charArray[i]);
            }
            if(i<charArray.length-1){
                System.out.print("-");
            }
        }
        
    }
    public static void main(String [] args){
        solution("abcaba");
    }
}
