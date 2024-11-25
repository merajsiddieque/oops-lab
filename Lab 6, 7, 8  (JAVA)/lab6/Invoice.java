package lab6;

public class Invoice {
 private String partNumber;
 private String partDescription;
 private int quantity;
 private double pricePerItem;

 public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
     this.partNumber = partNumber;
     this.partDescription = partDescription;
     setQuantity(quantity); 
     setPricePerItem(pricePerItem); 
 }

 public void setPartNumber(String partNumber) {
     this.partNumber = partNumber;
 }

 public String getPartNumber() {
     return partNumber;
 }

 public void setPartDescription(String partDescription) {
     this.partDescription = partDescription;
 }

 public String getPartDescription() {
     return partDescription;
 }

 public void setQuantity(int quantity) {
     if (quantity > 0) {
         this.quantity = quantity;
     } else {
         this.quantity = 0;
     }
 }

 public int getQuantity() {
     return quantity;
 }

 public void setPricePerItem(double pricePerItem) {
     if (pricePerItem > 0) {
         this.pricePerItem = pricePerItem;
     } else {
         this.pricePerItem = 0.0;
     }
 }

 public double getPricePerItem() {
     return pricePerItem;
 }

 public double getInvoiceAmount() {
     return quantity * pricePerItem;
 }

 public static void main(String[] args) {
     Invoice invoice = new Invoice("1234", "Hammer", 10, 19.99);

   
     System.out.println("Part Number: " + invoice.getPartNumber());
     System.out.println("Part Description: " + invoice.getPartDescription());
     System.out.println("Quantity: " + invoice.getQuantity());
     System.out.println("Price Per Item: ₹" + invoice.getPricePerItem());
     System.out.println("Invoice Amount: ₹" + invoice.getInvoiceAmount());

     invoice.setQuantity(-5); 
     invoice.setPricePerItem(-15.99); 

     System.out.println("\nAfter -ve values:");
     System.out.println("Quantity: " + invoice.getQuantity());
     System.out.println("Price Per Item: ₹" + invoice.getPricePerItem());
     System.out.println("Invoice Amount: ₹" + invoice.getInvoiceAmount());

 }
}
