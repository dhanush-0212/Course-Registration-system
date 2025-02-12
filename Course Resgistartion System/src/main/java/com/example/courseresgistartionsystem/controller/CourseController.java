package com.example.courseresgistartionsystem.controller;


import com.example.courseresgistartionsystem.model.Course;
import com.example.courseresgistartionsystem.model.CourseRegistry;
import com.example.courseresgistartionsystem.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5500")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("courses")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @PostMapping("courses/register")
    public String registerCourse(@RequestParam("name") String name,
                                 @RequestParam("email") String emailid,
                                 @RequestParam("coursename") String coursename) {
        courseService.registercourse(name,emailid,coursename);
        return "Congratulations! " + name + " sucessfully registered for " + coursename;
    }
    @GetMapping("/")
    public String home() {
        return "Welcome to Course Registration System";
    }

}
