package com.example.onetomanyHw.repositories;

import com.example.onetomanyHw.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
}
