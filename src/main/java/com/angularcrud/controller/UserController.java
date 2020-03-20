package com.angularcrud.controller;


import com.angularcrud.model.User;
import com.angularcrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public User register(@RequestBody User user) { return userService.saveUser(user); }

    @GetMapping("/getAllUsers")
    public List<User> findAllUser() { return userService.getUsers(); }

    @GetMapping("/findUser/{email}")
    public User findUserByEmail(@PathVariable String email) { return userService.getUserByEmail(email); }

    @GetMapping("/findUser/{id}")
    public User findUserById(@PathVariable int id) { return userService.getUserById(id); }

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable int id) { return userService.deleteUserById(id); }

    @PutMapping("/updateUser")
    public User updateUser(@RequestBody User user) { return userService.updateUser(user); }

}
