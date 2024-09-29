package chapter10;

public class CommissionEmployee extends Employee {

    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName,
            String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            System.out.println("Invalid");
        } else {
            this.commissionRate = commissionRate;
        }
        if (grossSales < 0.0) {
            System.out.println("Inavlid");
        } else {
            this.grossSales = grossSales;
        }
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) {
            System.out.println("Inavlid");
        } else {
            this.grossSales = grossSales;
        }
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            System.out.println("Invalid");
        } else {
            this.commissionRate = commissionRate;
        }
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    @Override
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",
                "commission employee", super.toString(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate());
    }
}
