package com.example.demo.repository;

import com.example.demo.entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InstructorRepo extends JpaRepository<Instructor, Long> {

    List<Instructor> findByDesignation(String designation);


}
