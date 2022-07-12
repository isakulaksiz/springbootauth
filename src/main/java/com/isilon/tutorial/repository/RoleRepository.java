package com.isilon.tutorial.repository;

import com.isilon.tutorial.model.ERole;
import com.isilon.tutorial.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
