package com.bezkoder.spring.jwt.mongodb.security.services;

import com.bezkoder.spring.jwt.mongodb.models.Cart;
import com.bezkoder.spring.jwt.mongodb.models.CartItem;
import com.bezkoder.spring.jwt.mongodb.models.Product;
import com.bezkoder.spring.jwt.mongodb.models.User;
import com.bezkoder.spring.jwt.mongodb.repository.CartRepository;
import com.bezkoder.spring.jwt.mongodb.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private ProductRepository productRepository;

    public Cart getCartByUser(String userId){
        return cartRepository.findByUserId(userId);
    }

    public void addToCart(String userId, String productId, int quantity){
        Cart cart = cartRepository.findByUserId(userId);
        if (cart==null){
            cart = new Cart();
            cart.setUser(new User(userId));
            cartRepository.save(cart);
        }
        Product product = productRepository.findByProductId(productId);
        CartItem cartItem = cart.getCartItemList().stream()
                .filter(cartItem1 -> cartItem1.getProduct().getProductId().equals(productId))
                .findFirst()
                .orElse(null);
        if(cartItem !=null){
            cartItem.setQuantity(cartItem.getQuantity()+ quantity);
        }
        else {
            CartItem cartItem1 = new CartItem();
            cartItem1.setProduct(product);
            cartItem1.setQuantity(quantity);
            cart.getCartItemList().add(cartItem1);
        }
        cartRepository.save(cart);
    }


}
