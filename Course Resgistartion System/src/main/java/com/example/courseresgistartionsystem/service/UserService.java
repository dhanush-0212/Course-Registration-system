package com.example.courseresgistartionsystem.service;

import com.example.courseresgistartionsystem.model.Users;
import com.example.courseresgistartionsystem.repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UsersRepo usersRepo;

    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
    public void add(Users user) {
        user.setPassword(encoder.encode(user.getPassword()));
        usersRepo.save(user);
    }
}
