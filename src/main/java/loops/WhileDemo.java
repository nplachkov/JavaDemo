package loops;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        //for printCalculateFactorial
        System.out.printf("1. Please enter a number (0-33): ");
        Scanner numberScan1 = new Scanner(System.in);
        int numberInput1 = numberScan1.nextInt();

        //for printFactorialUsingDoWhile
        System.out.printf("2. Please enter a number (0-33): ");
        Scanner numberScan2 = new Scanner(System.in);
        int numberInput2 = numberScan2.nextInt();

        //calls methods
        printCalculateFactorial(numberInput1);
        printFactorialUsingDoWhile(numberInput2);

    }
    public static void printCalculateFactorial(int number){ //Calculate factorial from the user input. (While Loop)
        //local variables
        int result = 1;
        int inputValue = number;

        while (inputValue > 0){
            result *= inputValue;
            inputValue--;
        }
        System.out.printf("\n1. You have entered %d. Factorial is: %d", number, result);
    }

    public static void printFactorialUsingDoWhile(int number){ //Calculate factorial from specified number (Do-While Loop)
        //local variables
        int result = 1;
        int inputValue = number;

        do {
            result *= inputValue;
            inputValue--;
        } while (inputValue > 0);
        System.out.printf("\n2. You have entered %d. Factorial is: %d", number, result);
    }
}