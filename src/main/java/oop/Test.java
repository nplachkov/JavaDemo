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

        //Cat 1
        Cat SnowWhite = new Cat("Persian");
        SnowWhite.setName("SnowWhite");
        SnowWhite.setAge((byte) 3);
        SnowWhite.setSex("Female");
        SnowWhite.setWeight(3.5f);

       Hera.petDetails();
       Leo.petDetails();

       Hera.bark();
       SnowWhite.petDetails();
    }
}
