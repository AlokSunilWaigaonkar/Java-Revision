

public class StringCompression {
    public static String frequeString(String str){
        StringBuilder sb = new StringBuilder();
        int count [] = new int[26];
        for(int i =0;i<str.length();i++){
            count[str.charAt(i)-'a']++;
        }
        for(int i =0;i<count.length;i++){
            if(count[i]>0){
                sb.append((char)(97+i));
                sb.append(count[i]);
            }
        }
        String compressed = sb.toString();
        return compressed;
    }

    public static String stringCompression(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>0){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }

    public static void main(String [] args){
        String str = "aaabbcccacd";
        String result = stringCompression(str);
        System.out.println(result);
    }
}
