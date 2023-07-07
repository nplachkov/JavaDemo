package data.types;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        //creating objects o1 and o2 from class Variables
        Variables o1 = new Variables();
        Variables o2 = new Variables();

        //Question 1
        System.out.printf("1. How old are you? - "); //Prints out a message
        Scanner scanner1 = new Scanner(System.in); //Asks for input
        String ageScan1 = scanner1.nextLine(); //Stores the input
        o1.age= Byte.parseByte(ageScan1); //age = to byte input

        //Question 2
        System.out.printf("2. How old are you? - ");
        Scanner scanner2 = new Scanner(System.in);
        String ageScan2 = scanner2.nextLine();
        o2.age= Byte.parseByte(ageScan2);



        //o1.age=21;
        //o2.age=16;

        o1.printAge(); //Prints the inputted age
        o1.printCanDrink(); //Prints yes/no depending on the age
        o2.printAge();
        o2.printCanDrink();
    }
}
