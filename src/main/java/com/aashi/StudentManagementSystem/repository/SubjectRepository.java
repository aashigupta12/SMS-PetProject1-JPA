package com.aashi.StudentManagementSystem.repository;

import com.aashi.StudentManagementSystem.entities.Student;
import com.aashi.StudentManagementSystem.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {
    List<Subject> findAllByStudent(Student student);

}
