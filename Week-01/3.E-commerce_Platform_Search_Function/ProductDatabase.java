import java.util.ArrayList;
import java.util.List;

public class ProductDatabase {
    private List<Product> products;

    public ProductDatabase() {
        products = new ArrayList<>();
        products.add(new Product("iPhone 14", "Electronics", 79999));
        products.add(new Product("Samsung Galaxy", "Electronics", 69999));
        products.add(new Product("Levi's Jeans", "Clothing", 2999));
        products.add(new Product("Nike Shoes", "Footwear", 4999));
        products.add(new Product("Sony Headphones", "Electronics", 5999));
    }

    public List<Product> getAllProducts() {
        return products;
    }
}
