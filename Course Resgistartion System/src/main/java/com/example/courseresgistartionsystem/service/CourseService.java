package com.example.courseresgistartionsystem.service;


import com.example.courseresgistartionsystem.model.Course;
import com.example.courseresgistartionsystem.model.CourseRegistry;
import com.example.courseresgistartionsystem.repository.CourseRepo;
import com.example.courseresgistartionsystem.repository.CourseregistryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepo courseRepo;

    @Autowired
    CourseregistryRepo courseregistryRepo;

    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    public List<CourseRegistry> getenrolledStudents() {
        return courseregistryRepo.findAll();
    }

    public void registercourse(String name, String emailid, String course) {
        CourseRegistry Registry = new CourseRegistry(name,emailid,course);
        courseregistryRepo.save(Registry);
    }
}
