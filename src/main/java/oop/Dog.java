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

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;

    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        if (age >= 0) {
            this.age = age;
        }else {
            System.out.println("error");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
