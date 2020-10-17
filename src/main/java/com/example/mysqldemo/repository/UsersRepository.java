package com.example.mysqldemo.repository;


import com.example.mysqldemo.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Movie, Integer> {
}
