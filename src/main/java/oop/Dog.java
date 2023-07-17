package oop;

public class Dog {
    //characteristics
    public String breed;
    public float weight;
    public String sex;
    public byte age;
    public String name;

    //actions
    public void bark(){
        System.out.println(this.name + " is barking...");
    }
    public void eat(){
        System.out.println(this.name + " is eating...");
    }
    public void sleeps(){
        System.out.println(this.name + " is sleeping...");
    }




}
