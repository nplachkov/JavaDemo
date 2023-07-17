package oop;

public class Test {
    public static void main(String[] args) {
        Dog Hera = new Dog();
        Hera.setName("Hera");
        Hera.setAge((byte) 12);
        Hera.setSex("Female");
        Hera.setBreed("Boxer");
        Hera.setWeight(28.5f);

        Dog Leo = new Dog();
        Leo.setName("Leo");
        Leo.setAge((byte) 12);
        Leo.setSex("Male");
        Leo.setBreed("Pitbull");
        Leo.setWeight(25.0f);

        Hera.bark();
        Leo.bark();

        System.out.println(Hera.getAge());
    }
}
