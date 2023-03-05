package com.example.demo.repository;

import com.example.demo.entity.AssignmentScore;
import com.example.demo.entity.Assignments;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AssignmentScoreRepo extends JpaRepository<AssignmentScore, Long> {
//    find scores by assignmentId
    List<AssignmentScore> findByAssignmentAssignmentId(Long assignmentId);
//    List<AssignmentScore> findBySchoolStudent_id(Long student_id);
//    find by schoolStudent_id and
    List<AssignmentScore> findBySchoolStudentStudentId(Long studentId);


}
