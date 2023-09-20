package inheritance;

public class QualityAssurance extends EmployeeData{
    public boolean isAutomation;
    public QualityAssurance(String firstName, String lastName, String dateOfBirth, double monthlySalary) {
        super(firstName, lastName, dateOfBirth, monthlySalary);
    }

    public void calculateBonus(boolean isTargetAchieved, boolean isAutomation, double bonus){
        if (isTargetAchieved && isAutomation){
            setMonthlySalary(getMonthlySalary() + bonus + 500);
        } else if (isTargetAchieved) {
            setMonthlySalary(getMonthlySalary() + bonus);
        } else if (isAutomation) {
            setMonthlySalary(getMonthlySalary() + 500);
        }
    }
}
