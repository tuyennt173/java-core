package javacore;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("enter value of second number: ");
        int secondNumber = sc.nextInt();
        int chosen;
        
        // a little bit loop
        do {
            System.out.print("please choose any month (1 -> 12): ");
            chosen = sc.nextInt();
        } while(chosen < 1 || chosen > 12);
        
        if(firstNumber % 2 == 0) {
            System.out.printf("\n%d is a even number\n", firstNumber);
        } else {
            System.out.printf("\n%d is not a even number\n", firstNumber);
        }
        
        if(firstNumber == secondNumber) {
            System.out.printf("first number (%d) is equal to second number (%d)\n", firstNumber, secondNumber);
        } else if(firstNumber > secondNumber) {
            System.out.printf("first number (%d) is greater than second number (%d)\n", firstNumber, secondNumber);
        } else {
            System.out.printf("first number (%d) is smaller than second number (%d)\n", firstNumber, secondNumber);
        }
        
        switch(chosen) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.printf("\nThe month was chosen (%d) has 31 days\n", chosen);
                break;
            case 4: case 6: case 9: case 11:
                System.out.printf("\nThe month was chosen (%d) has 30 days\n", chosen);
                break;
            case 2:
                System.out.printf("\nThe month was chosen (2) has 28 days\n", chosen);
                break;
        }
       
    }
}
