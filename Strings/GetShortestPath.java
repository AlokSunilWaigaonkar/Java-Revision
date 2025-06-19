
public class GetShortestPath {
    public static double getShortestPath(String str){
        int x =0;
        int y =0;
        for(int i =0;i<str.length();i++){
            char dir = str.charAt(i);
            if(dir == 'W'){
                x--;
            }else if(dir == 'E'){
                x++;
            }else if(dir == 'N'){
                y++;
            }else if(dir == 'S'){
                y--;
            }
        }
        return Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
    }
    public static void main(String args[]){
        String path = "WNEENESENNN";
        double totalDistance = getShortestPath(path);
        System.out.println('a'-0);
        System.out.println(totalDistance);
    }
}
