public class BinanrySearch{

    public static int binarySearch(int arr[],int key){
        //Arrays needs to be sorted
        //Time Complexity : O(log n)
        int start=0;
        int end=arr.length-1;
        int mid=(start+end)/2;
        while(start<=end){
            if(arr[mid]==key){
                return mid+1;
            }
            else if(arr[mid]>key){
                mid=mid-1;
            }
            else{
                mid=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,9,10};
        int key =6;
        System.out.println(key +" is present at location "+binarySearch(arr, key));
    }
}