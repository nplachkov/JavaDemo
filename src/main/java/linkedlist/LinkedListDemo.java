package linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();
        cars.add("BMW"); //index 1
        cars.add(0,"Audi"); //index 0
        cars.add("Lada"); //index 2

        System.out.println(cars); //prints all indexes

        cars.remove(0); //removes index 0 (Audi)
        cars.set(1,"VW"); //sets index 1 to VW (replaces Lada)
        System.out.println(cars); //prints the amended indexes


    }
}
