package javacore;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int sum = 0;
        System.out.println("enter 10 values of elements in array!");
        for(int i = 0; i < 10; i++) {
            System.out.printf("please enter value of element %d in array: ", i + 1);
            arr[i] = sc.nextInt();
        }
        
        for(int num : arr) {
            sum += num;
        }
        
        System.out.printf("sum of array elements: %d\n", sum);
        
        //do-while was done in Condition Class;
        //while the same as do-while,
        //but they are diffirent in that do-while always do the task you want in the {...to do} 1 time (even if the condition is wrong)
    }
}
