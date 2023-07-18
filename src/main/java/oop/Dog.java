package oop;

public class Dog {
    //characteristics
    private String breed;
    private float weight;
    private String sex;
    private byte age;
    private String name;

    //Getter & Setter


    public String getBreed() {
        return breed;
    }

    private void setBreed(String breed) {
        if (!breed.isEmpty()) {
            this.breed = breed;
        }
        else{
            System.out.println("Error. Please enter a valid breed.");
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight >= 0.1f) {
            this.weight = weight;
        }
        else{
            System.out.println("Error. Please enter a valid weight.");
        }

    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (!sex.isEmpty()) {
            this.sex = sex;
        }
        else{
            System.out.println("Error. Please enter a valid sex.");
        }
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        if (age > 0) {
            this.age = age;
        }
        else {
            System.out.println("Error. Please enter a valid age.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        }
        else {
            System.out.println("Error. Please enter a valid name.");
        }
    }

    //constructor
    public Dog(String breed){
        setBreed(breed);
    }


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
