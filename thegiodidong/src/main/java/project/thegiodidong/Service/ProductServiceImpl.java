package project.thegiodidong.Service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.thegiodidong.Models.Product;
import project.thegiodidong.Repository.ProductRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepo;
    public ProductServiceImpl(ProductRepository productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public void deletedProduct(String id) {

    }

    @Override
    public void createProduct(Product product) {

    }

    @Override
    public Product save(Product product) {
        return null;
    }

    @Override
    public List<Product> getAllProducts(){
        return productRepo.findAll();
    }

    @Override
    public List<Product> getProduct(String id) {
        return null;
    }


//    @Override
//    public void createProduct(Product product) {
//        Optional<Product> existingProduct = productRepo.findById(product.getProductId());
//
//        // Check if a product with the same ID already exists
//        if (existingProduct.isPresent()) {
//            // Handle existing product scenario (e.g., throw an exception, log an error, or provide a user-friendly message)
//            throw new RuntimeException("Product with ID " + product.getProductId() + " already exists.");
//        } else {
//            // Create the new product
//
//            productRepo.save(product);
//        }
//    }
//
//
//    @Override
//    public Product save(Product product) {
//        return productRepo.save(product);
//    }

}
