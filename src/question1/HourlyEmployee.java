package question1;

public class HourlyEmployee extends Employee {
    private double wage;
    private double hoursWorked;

    public HourlyEmployee(String firstName, String lastName,
                          String socialSecurityNumber,
                          double wage, double hoursWorked) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void print() {
        super.print();
        System.out.printf("Wage: $%.2f%n", wage);
        System.out.println("Hours Worked: " + hoursWorked);
    }
}