package oop;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Dog 1
        Dog Hera = new Dog("Boxer");
        Hera.setName("Hera");
        Hera.setAge((byte) 12);
        Hera.setSex("Female");
        Hera.setWeight(28.5f);

        //Dog 2
        Dog Leo = new Dog("Pitbull");
        Leo.setName("Leo");
        Leo.setAge((byte) 12);
        Leo.setSex("Male");
        Leo.setWeight(25.0f);


        Hera.dogDetails();
        System.out.println("----------------------");
        Leo.dogDetails();
    }
}
