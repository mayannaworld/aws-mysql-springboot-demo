package com.example.mysqldemo.resource;

import com.example.mysqldemo.model.Movie;
import com.example.mysqldemo.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/movies")
public class UsersResource {

    @Autowired
    UsersRepository usersRepository;

    @GetMapping(value = "/all")
    public List<Movie> getAll() {
        return usersRepository.findAll();
    }

    @PostMapping(value = "/load")
    public List<Movie> persist(@RequestBody final Movie movie) {
        usersRepository.save(movie);
        return usersRepository.findAll();
    }

}
