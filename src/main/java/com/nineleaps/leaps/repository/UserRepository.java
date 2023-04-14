package com.nineleaps.leaps.repository;

import com.nineleaps.leaps.enums.Role;
import com.nineleaps.leaps.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    User findByRole(Role role);
}
