//package com.bezkoder.spring.jwt.mongodb.controllers;
//
//import com.bezkoder.spring.jwt.mongodb.models.Cart;
//import com.bezkoder.spring.jwt.mongodb.security.services.CartService;
//import com.bezkoder.spring.jwt.mongodb.security.services.UserDetailsImpl;
//import com.sun.security.auth.UserPrincipal;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.core.annotation.AuthenticationPrincipal;
//import org.springframework.stereotype.Repository;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@CrossOrigin(origins = "*", maxAge = 3600)
//@RestController
//@RequestMapping("/api/auth")
//public class CartController {
//    @Autowired
//    private CartService cartService;
//    @GetMapping("/carts")
//    public ResponseEntity<Cart> getCart(@AuthenticationPrincipal UserDetailsImpl userPrincipal){
//        String userId= userPrincipal.getI;
//    }
//}
