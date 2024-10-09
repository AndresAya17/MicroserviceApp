package com.domi.course.service;

import com.domi.course.entities.Course;
import com.domi.course.http.response.StudentByCourseResponse;

import java.util.List;

public interface ICourseService {

    List<Course> findAll();

    Course findById(Long id);

    void save(Course course);

    StudentByCourseResponse findStudentByCourse(Long idCourse);
}
