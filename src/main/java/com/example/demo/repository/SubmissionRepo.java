package com.example.demo.repository;

import com.example.demo.entity.Assignments;
import com.example.demo.entity.SchoolStudents;
import com.example.demo.entity.Submission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubmissionRepo extends JpaRepository<Submission, Long> {
    List<Submission> findByStudent(SchoolStudents student);
    List<Submission> findByAssignment(Assignments assignment);
    List<Submission> findByAssignmentAndStudent(Assignments assignment, SchoolStudents student);


}

