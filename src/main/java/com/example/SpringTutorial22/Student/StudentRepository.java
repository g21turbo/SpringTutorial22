package com.example.SpringTutorial22.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // means this interface is responsible for data access
public interface StudentRepository
        extends JpaRepository<Student, Long> {
}
