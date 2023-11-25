public class Main {
    public static void main(String[] args) {
        List<ShoppingCart> products = new ArrayList<ShoppingCart>();
        products.add(new ShoppingCart("Leather wallet", 1100, 18, 1));
        products.add(new ShoppingCart("Umbrella", 900, 12, 4));
        products.add(new ShoppingCart("Cigarette", 200, 28, 3));
        products.add(new ShoppingCart("Honey", 100, 0, 2));

        System.out.printf("%-20s %-20s %-10s %-8s%n", "Product", "Unit Price in Rupees", "GST in %", "Quantity");
        for (ShoppingCart item : products) {
            System.out.printf("%-20s %-20s %-10s %-8s%n",item.ProductName(),item.UnitPrice(),item.GST(),item.Qty());
        }
        double maximumGst = 0;
        String maxGstProduct = "";
        for(ShoppingCart item : products){
            double gst = item.GST();
            double price = item.UnitPrice();
            double CalculateGST = (gst * price) / 100; //Calculate gst
            if (CalculateGST > maximumGst)
            {
                maximumGst = CalculateGST;
                maxGstProduct = item.ProductName(); //Assigns the product name to the maxGstProduct having maximum GSt
            }
        }
        System.out.println("Product with maximum GST amount: " + maxGstProduct);
        double totalAmount = 0;
        for(ShoppingCart item : products){
            double unitPrice = item.UnitPrice();
            int quantity = item.Qty();
            double discount = 0;
            if (unitPrice >= 500) //Calculate discount if unit price is greater than 500
            {
                discount = (unitPrice * 5) / 100;
            }
            double gstAmount = (unitPrice * item.GST()) / 100;
            totalAmount += ((unitPrice - discount + gstAmount) * quantity);
        }
        System.out.println("Total amount to be paid "+totalAmount);
    }
}
tv.txt
Displaying tv.txt.
}
