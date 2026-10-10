package question2;

import java.util.ArrayList;

public class InterfaceDriver {

    public static void main(String[] args) {

        ArrayList<Payable> payables =
                new ArrayList<>();

        payables.add(
                new Freelancer(
                        "John",
                        "Smith",
                        30.00,
                        35.00
                )
        );

        payables.add(
                new Freelancer(
                        "Sarah",
                        "Johnson",
                        40.00,
                        45.00
                )
        );

        payables.add(
                new VendorInvoice(
                        "Amazon Web Services",
                        "INV-1001",
                        650.00
                )
        );

        payables.add(
                new VendorInvoice(
                        "Office Depot",
                        "INV-1002",
                        375.00
                )
        );

        double totalPayout = 0.0;

        System.out.println("PAYABLE REPORT");
        System.out.println("==============");
        System.out.println();

        for (Payable payable : payables) {

            payable.print();

            totalPayout +=
                    payable.calculatePayment();
        }

        System.out.println("----------------------------");

        System.out.printf(
                "Total Payout: $%.2f%n",
                totalPayout
        );
    }
}