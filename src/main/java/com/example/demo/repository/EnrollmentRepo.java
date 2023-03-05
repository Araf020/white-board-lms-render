package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Enrollment;
import com.example.demo.entity.Course;

import java.util.List;


public interface EnrollmentRepo extends JpaRepository<Enrollment, Long> {


    List<Enrollment>  findByCourseCourseId(Long course_id);

    List<Enrollment> findByStudentStudentId(Long student_id);

    Enrollment findByCourseCourseIdAndStudentStudentId(Long course_id, Long student_id);
    
}
