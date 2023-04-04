package com.ajkko.springbootjwt.repository;

import com.ajkko.springbootjwt.models.ERole;
import com.ajkko.springbootjwt.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
