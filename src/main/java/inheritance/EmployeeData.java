package inheritance;

public class EmployeeData {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private double monthlySalary;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (!firstName.isEmpty())
            this.firstName = firstName;
        else System.out.println("ERROR. First name can't be empty.");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public EmployeeData(String firstName, String lastName, String dateOfBirth, double monthlySalary){
        setFirstName(firstName);
        setLastName(lastName);
        setDateOfBirth(dateOfBirth);
        setMonthlySalary(monthlySalary);
    }

    public void calculateBonus(boolean isTargetAchieved, double bonus){
        if (isTargetAchieved){
            setMonthlySalary(getMonthlySalary() + bonus);
        }
    }
}
