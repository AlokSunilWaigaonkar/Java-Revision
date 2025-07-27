

public class NamePrinting {

    public static void printName(int count ,int n){
        

        if(count == n){
            return;
        }
        System.out.println("Alok");
        printName(count+1,n);
    }
    public static void main(String[] args) {
        printName(1,5);
    }
}
