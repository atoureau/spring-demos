package com.spring.demo.accesingdatamysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

import com.spring.demo.accesingdatamysql.entity.User;
import com.spring.demo.accesingdatamysql.repository.UserRepository;

/**
 * Spring controller for handling HTTP Requests received in the server.
 * 
 * @author Alexander Toureau
 */
@Controller
@RequestMapping(path = "/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    /**
     * Finds a user in the database by its identifier.
     * 
     * @param id The user's unique identifier.
     * @return The user or empty if none was found.
     */
    @GetMapping(path = "/find")
    public @ResponseBody Optional<User> find(@RequestParam Long id) {
        return userRepository.findById(id);
    }

    /**
     * Finds all the users in the database.
     * 
     * @return A collection of found users in JSON or XML format.
     */
    @GetMapping(path = "/find-all")
    public @ResponseBody Iterable<User> findAll() {
        return userRepository.findAll();
    }

    /**
     * Inserts a new user in the database.
     * 
     * @param name  The user's name.
     * @param email The user's e-mail address.
     * @return A string confirming the saved user.
     */
    @PostMapping(path = "/save")
    public void save(@RequestParam String name, @RequestParam String email) {
        userRepository.save(new User(null, name, email));
    }

    /**
     * Deletes a user in the database by its unique identifier.
     * 
     * @param id The user's unique identifier.
     */
    @DeleteMapping(path = "/delete")
    public void delete(@RequestParam Long id) {
        userRepository.deleteById(id);
    }

}
