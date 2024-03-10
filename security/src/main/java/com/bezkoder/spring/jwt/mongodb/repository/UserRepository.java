package com.bezkoder.spring.jwt.mongodb.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bezkoder.spring.jwt.mongodb.models.User;

public interface UserRepository extends MongoRepository<User, String> {
//  User findByUsername(String username);
  User findAllByUsername(String usn);
  Boolean existsByUsername(String username);
  Boolean existsByEmail(String email);
}
