package LiskovSubsitutionPrinciple.Before.OpenClosePrinciple.After;

import java.util.ArrayList;
import java.util.List;

// Liskov princple states the object should be replacable with its subtype without affecting its correctness
// in below example if you see, Product object needs to be asked for type and cannot work if type check is removed
public class PricingUtils {
    void main() {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new InHouseProduct();
        List<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        for (Product p :
                products) {
            p.getDiscount(); // No extra checks required to make it work
        }
    }
}

class Product {
    Double discount;

    public Double getDiscount() {
        return 20.0;
    }
}

class InHouseProduct extends Product {

    private void applyExtraDiscount() {
        discount = 1.5 * 20;
    }

    @Override
    public Double getDiscount() {
        applyExtraDiscount(); // here we tell not ask, hence fixing the LSP
        return discount;
    }
}
