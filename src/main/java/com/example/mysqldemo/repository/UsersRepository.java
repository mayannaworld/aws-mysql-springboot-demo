package com.example.mysqldemo.repository;


import com.example.mysqldemo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
