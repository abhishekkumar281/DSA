package ARRAY;

public class Sort_Colour {
    public static void sortColors(int[] nums) {
        int zeros = 0, ones  = 0, n = nums.length;

        for(int i = 0; i < n; i++){
            if(nums[i] == 0) zeros++;
            if(nums[i] == 1) ones++;
        }

        for(int i = 0; i < n; i++) {
            if(i < zeros) nums[i] = 0;
            if(zeros <= i && i < zeros + ones) nums[i] = 1;
            if(i >= zeros + ones) nums[i] = 2;
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,0,1,2,0,};
        sortColors(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
