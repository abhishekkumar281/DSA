public class Linear_Search {
    public static int linearSearch(int arr[],int key) {
        for(int i=0; i<= arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {12,4,6,8,9,17};
        System.out.println(linearSearch(arr,6));
    }
}