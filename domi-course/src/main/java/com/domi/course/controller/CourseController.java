package com.domi.course.controller;


import com.domi.course.entities.Course;
import com.domi.course.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/course")
public class CourseController {

    @Autowired
    private ICourseService courseService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveCourse(@RequestBody Course course){
        courseService.save(course);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllCourse(){
        return ResponseEntity.ok(courseService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok(courseService.findById(id));
    }

    @GetMapping("/search-student/{idCourse}")
    public ResponseEntity<?> findStudentsByIdCourse(@PathVariable Long idCourse){
        return ResponseEntity.ok(courseService.findStudentByCourse(idCourse));
    }
}
