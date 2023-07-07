package data.types;

public class Variables {
    byte age;

    public static void main(String[] args) {

    }
    public void printAge(){
        System.out.println("\nEntered age: " + age);
    }

    public void printCanDrink(){
        if (age >= 18){
            System.out.println("Can drink? - Yes!");
        }else {
            System.out.println("Can drink? - Sorry :(");
        }
    }
}
