public class Array_Practice_Set {
    public static void main(String[] args) {
        // Practice Problem 1
        float [] marks = {45.5f, 67.6f, 63.4f, 99.2f, 100.0f};
        float sum =0;
        for (float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of sum is " + sum);

        // Practice Problem 2
        float [] mark = {45.5f, 67.6f, 63.4f, 99.2f, 100.0f};
        float num =45.53f;
        boolean isInArray = false;
        for (float element:marks){
            if (num==element){
                isInArray = true;
                break;
            }
        }
        if (isInArray){
            System.out.println("The value is present in the array");
        }
        else {
            System.out.println("The value is not present in the array");

        }


        // Practice Problem 3
        float [] score = {45.5f, 67.6f, 63.4f, 99.2f, 100.0f};
        float sums =0;
        for (float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of average marks is " + sum/marks.length);

        // Problem 4
        int[][] mat1 = {{1, 2, 3},
                {4, 5, 6}};
        int[][] mat2 = {{2, 6, 13},
                {3, 7, 1}};
        int[][] result = {{0, 0, 0},
                {0, 0, 0}};

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];

            }
            System.out.println("");
        }

       // Problem no 5
        int [] arr = {1,2,3,4,5,6};
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int temp;

        for (int i=0; i<n; i++) {
            // swap a[i] and a[l-1-i]
            temp = arr[i];
            arr[i] = arr[l - i - 1];
            arr[l - i - 1] = temp;
        }
        for (int element: arr){
            System.out.println(element);

        }

        //problem  6
        int [] array = {1,455,3,34,5,67};
        int max = 0;
        for(int e: arr){
            if(e>max){
                max = e;
            }
        }
        System.out.println("the value of the maximum element in this array is: "+ max);


        // probblem  7

        boolean isSorted = true;
        int [] arrays = {1,5,7,8,45,67};
        for (int i=0;i<arr.length-1;i++){
            if (arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.printf("The Array is sorted");
        }
        else {
            System.out.println("The Array is not sorted");
        }
    }
}
