package com.example.demo.repository;

import com.example.demo.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepo  extends JpaRepository<Course, Long> {

    Course findCourseByCourseTitleEquals(String title);
    List<Course> findAllByCreditHour(double credit_hour);
    Course findCourseByCourseCode(String course_code);
    List<Course> findCourseByCourseGrade(String grade);
}