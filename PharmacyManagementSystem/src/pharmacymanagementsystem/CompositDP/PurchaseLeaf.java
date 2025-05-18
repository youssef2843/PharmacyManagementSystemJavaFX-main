package pharmacymanagementsystem.CompositDP;

import pharmacymanagementsystem.customerData;

public class PurchaseLeaf implements PurchaseComponent {
    private final customerData data;

    public PurchaseLeaf(customerData data) {
        this.data = data;
    }

    @Override
    public double getTotalPrice() {
        return data.getPrice();
    }

    @Override
    public void display() {
        System.out.println("Medicine: " + data.getProductName() + ", Price: " + data.getPrice());
    }
}