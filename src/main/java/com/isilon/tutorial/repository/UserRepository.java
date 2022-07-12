package com.isilon.tutorial.repository;

import com.isilon.tutorial.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserName(String username);
    Boolean existByUserName(String username);
    Boolean existByEmail(String email);
}
