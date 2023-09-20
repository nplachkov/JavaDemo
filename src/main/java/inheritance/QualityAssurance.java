package inheritance;

public class QualityAssurance extends EmployeeData{
    private boolean isAutomation;
    public QualityAssurance(String firstName, String lastName, String dateOfBirth, double monthlySalary) {
        super(firstName, lastName, dateOfBirth, monthlySalary);
    }
    public void calculateBonus(boolean isAutomation, double bonus){
        if (isAutomation){
            setMonthlySalary(getMonthlySalary() + bonus + 500);
        }
    }
}
