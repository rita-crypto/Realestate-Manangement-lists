package com.diyo.realestatelist.controller;

import com.diyo.realestatelist.entity.User;
import com.diyo.realestatelist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    private ResponseEntity<String> registerUser(@RequestBody User user){
        userService.registerUser(user);
        return ResponseEntity.ok("success");
    }

    @PostMapping("/login")
    private ResponseEntity<String> loginUser(@RequestBody User user){
        return ResponseEntity.ok().body(userService.findByEmailAndPassword(user));
    }

    @PostMapping("/loginadmin")
    private ResponseEntity<String> adminLogin(@RequestBody User user){
        return ResponseEntity.ok().body(userService.loginAdmin(user));
    }
}
