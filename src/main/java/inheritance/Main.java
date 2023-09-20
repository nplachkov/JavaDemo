package inheritance;

public class Main {
    public static void main(String[] args) {
        SupportAgent agent1 = new SupportAgent("Alexander", "Iliev", "10/07/1998",1500);
        SupportAgent agent2 = new SupportAgent("Georgi", "Ivanov", "25/01/1995",2500);
        QualityAssurance qa1 = new QualityAssurance("Ivan","Ivanov","05/06/1990",3000);
        QualityAssurance qa2 = new QualityAssurance("Nikolay","Plachkov","19/06/1992",3000);

        agent1.calculateBonus(true, 500);
        System.out.println(agent1.getMonthlySalary());

        qa1.calculateBonus(false, true, 500);
        System.out.println(qa1.getMonthlySalary());

        qa2.calculateBonus(false, false,500 );
        System.out.println(qa2.getMonthlySalary());
    }
}
