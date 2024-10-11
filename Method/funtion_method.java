import java.util.*;
import java.util.Scanner;

public class funtion_method {
    public static void printhelloworld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
 //  Parametter Concept

    public static void calculateSum(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("sum is : " + sum);
    }
    public static void main(String args[]){
     //   printhelloworld();
        calculateSum();

    }

}
