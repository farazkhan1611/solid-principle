package LiskovSubsitutionPrinciple.Before.OpenClosePrinciple.Before;

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
            if (p instanceof InHouseProduct) { // extra type check to support different discount on in house product then usual product
                ((InHouseProduct) p).applyExtraDiscount();
            } else {
                p.getDiscount();
            }
        }
    }
}

class Product {
    public Double getDiscount() {
        return 20.0;
    }
}

class InHouseProduct extends Product {

    public Double applyExtraDiscount() {
        return 1.5 * 20;
    }
}
