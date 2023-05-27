package JavaTop;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void sellProduct(String productName) {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.getName().equals(productName)) {
                System.out.println("Продукт '" + productName + "' продан!");
                products.remove(i);
                return;
            }
        }
        System.out.println("Продукт '" + productName + "' не найден в вендинговой машине.");
    }
}

