package arraydemo;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        int [] numbers = {4, 12 ,43, 543, 56, 234, 4};
        int [] numbers2 = new int[4];
        String [] cities = {"Sofia", "Plovdiv", "Gotse Delchev", "Ruse", "Burgas", "Varna"};
        char [] mandatoryPasswordSymbols = {'&', '$', '@'};

        numbers2[3] = 4;

        printValues(numbers);
        System.out.println("-----------------------------");
        printValues(numbers2);
        System.out.println("-----------------------------");
        printCities(cities);
    }
    public static void printValues(int [] array){
        for (int i = 0; i < array.length ; i++) {
            System.out.printf("At index: %d, is the value: %d\n", i, array[i]);
        }
    }
    public static void printCities(String [] array){
        for (int i = 0; i < array.length; i++){
            System.out.printf("At index: %s, is the value: %s\n", i, array[i]);
        }
    }
}