
public class GetIthBit {
    public static void getIthBit(int num , int i){
        int bitMask = 1<<i;
        if((num & bitMask) != 0){
            System.out.println("Bit is 1");
        }
        else{
            System.out.println("Bit is 0");
        }
    }
    public static void main(String[] args) {
        getIthBit(6, 1);
    }
}
