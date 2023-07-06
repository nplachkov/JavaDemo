package decision;

import java.util.Scanner;

public class DecisionMaking {
    int userAge = 10;
    
    public static void main(String[] args) {
        System.out.printf("Please enter your age: ");
        Scanner ageScan = new Scanner(System.in);
        int userAgeInput = Integer.parseInt(ageScan.nextLine());
        printUserDetails(userAgeInput);

        System.out.println("");
        System.out.println("------------");
        System.out.println("");

        System.out.printf("Choose a month from 1 to 6: ");
        Scanner monthScan = new Scanner(System.in);
        int userMonthInput = Integer.parseInt(monthScan.nextLine());
        printMonthOfTheYear(userMonthInput);
    }
    public static void printUserDetails(int userAge){
        //kid: 0 - 13
        //teenager: 14 - 17
        //adult: 18 - 65
        //retired: 66 - 130

        if (userAge < 0 || userAge > 130){
            System.out.println("Error. Invalid entry.");
            return;
        }

        if (userAge >= 0 && userAge <= 13){
            System.out.printf("The user is a kid with the age of %d.\n", userAge);
        } else if (userAge >= 14 && userAge <= 17) {
            System.out.printf("The user is a teenager with the age of %d.\n", userAge);
        } else if (userAge >=18 && userAge <= 65) {
            System.out.printf("The user is an adult with the age of %d.\n", userAge);
        } else {
            System.out.printf("The user is retired with the age of %d.\n", userAge);
        }
    }

    public static void printMonthOfTheYear(int month){
        switch (month){
            case 1:
                System.out.println("Selected month is January.");
                break;
            case 2:
                System.out.println("Selected month is February.");
                break;
            case 3:
                System.out.println("Selected month is March.");
                break;
            case 4:
                System.out.println("Selected month is April.");
                break;
            case 5:
                System.out.println("Selected month is May.");
                break;
            case 6:
                System.out.println("Selected month is June.");
                break;
            default:
                System.out.println("Error. Invalid entry.");
        }
    }
}
