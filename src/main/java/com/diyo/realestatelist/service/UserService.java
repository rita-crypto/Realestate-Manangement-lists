package com.diyo.realestatelist.service;

import com.diyo.realestatelist.entity.User;
import com.diyo.realestatelist.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public void registerUser(User user) {
        userRepository.save(user);
    }

    public String findByEmailAndPassword(User user) {
        Optional<User> users = userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());
                if(users.isPresent()){
                    return "success";
        }
                else{
                    return "Invalid email or password";
                }
    }

    public String loginAdmin(User user) {

        if(user.getEmail().equals("admin@gmail.com") && user.getPassword().equals("admin123456")){
            return "admin";
        }
        else{
            return "Invalid admin login";
        }
    }
}
