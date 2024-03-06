package project.thegiodidong.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import project.thegiodidong.Models.Product;
import project.thegiodidong.Repository.ProductRepository;
import project.thegiodidong.Service.ProductService;


import java.util.Date;
import java.util.List;
import java.util.Optional;

import static javax.security.auth.callback.ConfirmationCallback.OK;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    private ProductService productService;
    @GetMapping("/products")
    public List<Product>getAllProducts(){
        return productService.getAllProducts();
    }

    @PostMapping("/products")
    public ResponseEntity<?>createProduct(@RequestBody Product product){
        try {
            product.setDate(new Date(System.currentTimeMillis()));
            productRepository.save(product);
            return new ResponseEntity<>(product,HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<?>getProduct(@PathVariable("id") String id){
        Optional<Product> productOptional = productRepository.findById(id);
        if (productOptional.isPresent()){
            return new ResponseEntity<>(productOptional.get(),HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Not product available", HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
    public void modifyContactById(@PathVariable("id") String id, @RequestBody Product product) {
        product.setProductId(id);
        productRepository.save(product);
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<?>deleteId(@PathVariable("id")String id){
        try{
            productRepository.deleteById(id);
            return new ResponseEntity<>("Deleted"+id, HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }

}
