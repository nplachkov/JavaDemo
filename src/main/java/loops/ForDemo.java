package loops;

import java.util.Arrays;

public class ForDemo {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
            System.out.printf("Current value of i (index) is: %d\n", i);
        }
        System.out.println("------------------------------------");

        for (int i = 1; i <= 20; i *= 2) {
            System.out.printf("Current value of i (index) is: %d\n", i);

        }

        System.out.println("------------------------------------");


    }
}
