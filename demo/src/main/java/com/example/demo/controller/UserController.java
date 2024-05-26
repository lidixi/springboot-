package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/new")
    public ResponseEntity<List<User>> getAllFromNew() {
        List<User> users = userService.getAllFromNew();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/old")
    public ResponseEntity<List<User>> getAllFromOld() {
        List<User> users = userService.getAllFromOld();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PostMapping("/new")
    public ResponseEntity<String> addUserToNew(@RequestBody User user) {
        userService.addUserToNew(user);
        return new ResponseEntity<>("User added to 'new' table successfully", HttpStatus.CREATED);
    }

    @PostMapping("/old")
    public ResponseEntity<String> addUserToOld(@RequestBody User user) {
        userService.addUserToOld(user);
        return new ResponseEntity<>("User added to 'old' table successfully", HttpStatus.CREATED);
    }

    @PutMapping("/new")
    public ResponseEntity<String> updateUserInNew(@RequestBody User user) {
        userService.updateUserInNew(user);
        return new ResponseEntity<>("User updated in 'new' table successfully", HttpStatus.OK);
    }

    @PutMapping("/old")
    public ResponseEntity<String> updateUserInOld(@RequestBody User user) {
        userService.updateUserInOld(user);
        return new ResponseEntity<>("User updated in 'old' table successfully", HttpStatus.OK);
    }

    @DeleteMapping("/new/{id}")
    public ResponseEntity<String> deleteUserFromNew(@PathVariable Long id) {
        userService.deleteUserFromNew(id);
        return new ResponseEntity<>("User deleted from 'new' table successfully", HttpStatus.OK);
    }

    @DeleteMapping("/old/{id}")
    public ResponseEntity<String> deleteUserFromOld(@PathVariable Long id) {
        userService.deleteUserFromOld(id);
        return new ResponseEntity<>("User deleted from 'old' table successfully", HttpStatus.OK);

    /*@GetMapping("/new")
    public List<User> getAllFromNew() {
        return userService.getAllFromNew();
    }

    @GetMapping("/old")
    public List<User> getAllFromOld() {
        return userService.getAllFromOld();

    }

    @PostMapping("/new")
    public void addUserToNew(@RequestBody User user) {
        userService.addUserToNew(user);
    }

    @PostMapping("/old")
    public void addUserToOld(@RequestBody User user) {
        userService.addUserToOld(user);
    }

    @PutMapping("/new")
    public void updateUserInNew(@RequestBody User user) {
        userService.updateUserInNew(user);
    }

    @PutMapping("/old")
    public void updateUserInOld(@RequestBody User user) {
        userService.updateUserInOld(user);
    }

    @DeleteMapping("/new/{id}")
    public void deleteUserFromNew(@PathVariable Long id) {
        userService.deleteUserFromNew(id);
    }

    @DeleteMapping("/old/{id}")
    public void deleteUserFromOld(@PathVariable Long id) {
        userService.deleteUserFromOld(id);*/
    }
}
