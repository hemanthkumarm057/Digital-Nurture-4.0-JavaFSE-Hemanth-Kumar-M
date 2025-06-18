import java.util.List;
import java.util.stream.Collectors;

public class SearchService {
    public List<Product> search(List<Product> products, String keyword) {
        final String searchKey = keyword.toLowerCase();  

        return products.stream()
            .filter(p -> p.getName().toLowerCase().contains(searchKey)
                      || p.getCategory().toLowerCase().contains(searchKey))
            .collect(Collectors.toList());
    }
}
