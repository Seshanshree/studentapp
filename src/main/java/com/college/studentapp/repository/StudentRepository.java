package com.college.studentapp.repository;

import com.college.studentapp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository
        extends JpaRepository<Student, Long> {
    // Nothing to write here!
    // Spring gives save(), findAll() automatically
}