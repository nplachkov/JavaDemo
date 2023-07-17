package oop;

public class Test {
    public static void main(String[] args) {
        Dog Hera = new Dog();
        Hera.name = "Hera";
        Hera.age = 12;
        Hera.sex = "Female";
        Hera.breed = "Boxer";
        Hera.weight = 28.5f;

        Dog Leo = new Dog();
        Leo.name = "Leo";
        Leo.age = 12;
        Leo.sex = "Male";
        Leo.breed = "Pitbull";
        Leo.weight = 25.0f;

        Hera.bark();
        Hera.eat();
        Hera.sleeps();

        Leo.bark();

    }
}
