package ARRAY;

public class FindSmallestAndLargestNumberInArray {
    public static int largest(int arr[]) {
        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int smallest(int arr[]) {
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<smallest) smallest=arr[i];
        }
        return smallest;
    }

    public static void main(String[] args) {
        int arr[] = {5,10,15,20,25};
        System.out.println(smallest(arr));
    }
}