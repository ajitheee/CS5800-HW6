package question2;

public class VendorInvoice implements Payable {

    private String vendorName;
    private String invoiceNumber;
    private double amountDue;

    public VendorInvoice(String vendorName,
                         String invoiceNumber,
                         double amountDue) {

        this.vendorName = vendorName;
        this.invoiceNumber = invoiceNumber;

        setAmountDue(amountDue);
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        if (amountDue < 0) {
            throw new IllegalArgumentException(
                    "Amount due cannot be negative."
            );
        }

        this.amountDue = amountDue;
    }

    @Override
    public double calculatePayment() {
        return amountDue;
    }

    @Override
    public String getPayeeName() {
        return vendorName;
    }

    @Override
    public void print() {
        System.out.println("Vendor: " + vendorName);

        System.out.println(
                "Invoice Number: " + invoiceNumber
        );

        System.out.printf(
                "Amount Due: $%.2f%n",
                amountDue
        );

        System.out.printf(
                "Payment: $%.2f%n",
                calculatePayment()
        );

        System.out.println();
    }
}