package chapter10;

public class SalariedEmployee2 extends Employee2 {

    private double weeklySalary;

    public SalariedEmployee2(String firstName, String lastName,
            String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        if (weeklySalary < 0.0) {
            System.out.println("Invalid");
        } else {
            this.weeklySalary = weeklySalary;
        }
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0.0) {
            System.out.println("Invalid");
        } else {
            this.weeklySalary = weeklySalary;
        }
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    @Override
    public double getPaymentAmount() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return String.format("salaried employee: %s%n%s: $%,.2f",
                super.toString(), "weekly salary", getWeeklySalary());
    }

}
