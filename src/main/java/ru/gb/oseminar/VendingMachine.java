package ru.gb.oseminar;
import java.util.List;

public class VendingMachine {
    private final List<Product> products;

    public VendingMachine (List<Product> products) {
        this.products = products;
    }

    public Product getProductByName (String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        throw new IllegalStateException("Product not found");
    }

    public List<Product> getProducts() {
        return this.products;
    }
}
