package ARRAY;

public class ReverseInArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;

        for (int i=0; i<n/2; i++){
            int temp = arr[i];
            arr[i]=arr[n-1];
            arr[n-1]=temp;
            n--;
        }

        for (int element : arr){
            System.out.println(element);
        }

    }
}
