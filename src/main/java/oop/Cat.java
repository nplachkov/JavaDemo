package oop;

public class Cat extends Pet {

    //constructor
    public Cat(String breed){
        super(breed); //calling the constructor breed from the super/parent class
    }

    //type specific actions
    public void meow(){
        System.out.println(getName() + " is meowing...");
    }
}