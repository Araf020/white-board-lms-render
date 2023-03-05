package com.example.demo.repository;

import com.example.demo.entity.Assignments;
import com.example.demo.entity.Submission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AssignmentRepo extends JpaRepository<Assignments, Long> {

    //find the submissions of a assignment

    Assignments findByAssTitle(String title);
    List<Assignments> findByCourseCourseId(Long course_id);
    // find assignment by is graded
    List<Assignments> findByGraded(boolean graded);
   



}
