// Invoice.java
public class Invoice {
    // Instance variables
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    // Constructor to initialize the instance variables
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        setQuantity(quantity); // Using the setter to handle non-positive values
        setPricePerItem(pricePerItem); // Using the setter to handle non-positive values
    }

    // Setters and getters for partNumber
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    // Setters and getters for partDescription
    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public String getPartDescription() {
        return partDescription;
    }

    // Setters and getters for quantity
    public void setQuantity(int quantity) {
        // Set to 0 if quantity is not positive
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters and getters for pricePerItem
    public void setPricePerItem(double pricePerItem) {
        // Set to 0.0 if price per item is not positive
        if (pricePerItem > 0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    // Method to calculate invoice amount
    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }

    // InvoiceTest class
    public static void main(String[] args) {
        // Create an Invoice object
        Invoice invoice = new Invoice("1234", "Hammer", 10, 19.99);

        // Display the part number, description, quantity, price per item, and total
        // invoice amount
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price Per Item: $" + invoice.getPricePerItem());
        System.out.println("Invoice Amount: $" + invoice.getInvoiceAmount());

        // Test for non-positive quantity and price
        invoice.setQuantity(-5); // Should set quantity to 0
        invoice.setPricePerItem(-15.99); // Should set price to 0.0

        System.out.println("\nAfter setting non-positive values:");
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price Per Item: $" + invoice.getPricePerItem());
        System.out.println("Invoice Amount: $" + invoice.getInvoiceAmount());

    }
}
