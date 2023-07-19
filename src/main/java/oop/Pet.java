package oop;

public class Pet implements PetActions {
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

    private void setBreed(String breed) { //validates if the string breed has a valid input.
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

    public void setWeight(float weight) { //validates if the float weight has a valid input.
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

    public void setSex(String sex) { //validates if the string sex has a valid input.
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

    public void setAge(byte age) { //validates if the byte age has a valid input
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

    public void setName(String name) { //validates if the string name has a valid input.
        if (!name.isEmpty()) {
            this.name = name;
        }
        else {
            System.out.println("Error. Please enter a valid name.");
        }
    }

    //constructor
    public Pet(String breed){
        setBreed(breed);
    }

    //actions
    public void eat(){
        System.out.println(getName() + " is eating...");
    }
    public void sleeps(){
        System.out.println(getName() + " is sleeping...");
    }

    @Override
    public void walk() {
        System.out.println(getName() + " is walking...");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping...");
    }

    @Override
    public void makeNoise() {
        System.out.println(getName() + " is making noise...");
    }

    public void petDetails(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge() + " years");
        System.out.println("Breed: " + getBreed());
        System.out.println("Sex: " + getSex());
        System.out.println("Weight: " + getWeight() + "kg");
    }
}