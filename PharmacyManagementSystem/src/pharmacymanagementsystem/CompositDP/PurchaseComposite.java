package pharmacymanagementsystem.CompositDP;

import java.util.ArrayList;
import java.util.List;

public class PurchaseComposite implements PurchaseComponent {
    private final List<PurchaseComponent> children = new ArrayList<>();

    public void add(PurchaseComponent component) {
        children.add(component);
    }

    public void remove(PurchaseComponent component) {
        children.remove(component);
    }

    @Override
    public double getTotalPrice() {
        return children.stream().mapToDouble(PurchaseComponent::getTotalPrice).sum();
    }

    @Override
    public void display() {
        for (PurchaseComponent child : children) {
            child.display();
        }
    }
}