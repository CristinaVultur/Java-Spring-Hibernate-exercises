package com.example.lab6ex1.controller;

import com.example.lab6ex1.model.User;
import com.example.lab6ex1.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<User>> userList(){
        return ResponseEntity.ok(userService.findAll());
    }

    @PostMapping("/new")
    public ResponseEntity<User> addUser(@RequestBody User user){
        User u = userService.save(user);
        return ResponseEntity.created(URI.create("/users/byId"+u.getId())).body(u);
    }

    @DeleteMapping("/deleteById/{userId}")
    public void deleteUserById(@PathVariable int userId){
        userService.deleteById(userId);
    }

    @GetMapping("/users/byId/{userId}")
    public ResponseEntity<User> userById(@PathVariable int userId){
        return ResponseEntity.ok(userService.findById(userId));
    }
}
