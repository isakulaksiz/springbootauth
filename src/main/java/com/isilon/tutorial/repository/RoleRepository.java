package com.isilon.tutorial.repository;

import com.isilon.tutorial.model.ERole;
import com.isilon.tutorial.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
