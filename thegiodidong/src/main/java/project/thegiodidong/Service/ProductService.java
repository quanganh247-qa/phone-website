package project.thegiodidong.Service;

import project.thegiodidong.Models.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    void deletedProduct(String id);
    public void createProduct(Product product);

    Product save(Product product);

    public List<Product> getAllProducts();
    public List<Product> getProduct(String id);

}
