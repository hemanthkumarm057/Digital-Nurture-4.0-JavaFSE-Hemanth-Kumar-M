public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product(105, "Smartphone", "Electronics"),
                new Product(101, "Laptop", "Electronics"),
                new Product(103, "Shoes", "Footwear"),
                new Product(104, "Watch", "Accessories"),
                new Product(102, "T-shirt", "Apparel")
        };

        int targetId = 103;

        Product result1 = SearchUtility.linearSearch(products, targetId);
        System.out.println("Linear Search Result: " + result1);

        Product result2 = SearchUtility.binarySearch(products, targetId);
        System.out.println("Binary Search Result: " + result2);
    }
}
