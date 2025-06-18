import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductDatabase db = new ProductDatabase();
        SearchService searchService = new SearchService();

        try (Scanner scanner = new Scanner(System.in)) {  // Auto-closed
            System.out.println("Available Categories:");
            System.out.println("Electronics");
            System.out.println("Clothing");
            System.out.println("Footware");
            System.out.println("Enter category to search: ");

            String input = scanner.nextLine();

            List<Product> results = searchService.search(db.getAllProducts(), input);

            if (results.isEmpty()) {
                System.out.println("No products found.");
            } else {
                System.out.println("Search results:");
                for (Product p : results) {
                    System.out.println(p);
                }
            }
        }
    }
}
