package question1;

public class InheritanceDriver {

    public static void main(String[] args) {

        Employee[] employees = {
                new SalariedEmployee("Joe", "Jones",
                        "111-11-1111", 2500),

                new HourlyEmployee("Stephanie", "Smith",
                        "222-22-2222", 25, 32),

                new HourlyEmployee("Mary", "Quinn",
                        "333-33-3333", 19, 47),

                new CommissionEmployee("Nicole", "Dior",
                        "444-44-4444", 0.15, 50000),

                new BaseEmployee("Renwa", "Chanel",
                        "555-55-5555", 1700),

                new BaseEmployee("Mike", "Davenport",
                        "666-66-6666", 95000),

                new CommissionEmployee("Mahnaz", "Vaziri",
                        "777-77-7777", 0.22, 40000)
        };

        System.out.println("EMPLOYEE INFORMATION");
        System.out.println("====================");

        for (Employee employee : employees) {
            employee.print();
            System.out.println("--------------------");
        }
    }
}