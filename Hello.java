public class Hello {
    public static void main(String[] args) {
        byte b= 127;
        System.out.println(b);

        int a= 257;  // modulus opeartion ...divide the number by the range 257%256
        byte c = (byte) a;
        System.out.println(c);


        // Type promotion

        byte x = 10;
        byte y = 20;
        int d = x*y;
        System.out.println(d);
    }
}

