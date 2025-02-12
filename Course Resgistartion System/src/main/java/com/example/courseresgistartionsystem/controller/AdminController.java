package com.example.courseresgistartionsystem.controller;

import com.example.courseresgistartionsystem.model.CourseRegistry;
import com.example.courseresgistartionsystem.model.Users;
import com.example.courseresgistartionsystem.service.CourseService;
import com.example.courseresgistartionsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "http://localhost:5500")
public class AdminController {

    @Autowired
    UserService userService;
    @Autowired
    CourseService courseService;

    @PostMapping("add-user")
    public void add(@RequestBody Users user){
        userService.add(user);
    }

    @GetMapping("courses-enrolled")
    public List<CourseRegistry> getEnrolledStudents() {

        return courseService.getenrolledStudents();
    }
}
