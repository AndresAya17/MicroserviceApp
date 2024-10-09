package com.domi.student.persistence;

import com.domi.student.entities.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStudentRepository extends CrudRepository<Student, Long> {

    List<Student> findAllByCourseId(Long idCourse);
}
