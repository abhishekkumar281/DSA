package ARRAY;

public class ArraySum {
    public static int sumArr(int arr[]){
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {

    }
}
