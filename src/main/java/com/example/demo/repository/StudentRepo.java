package com.example.demo.repository;

import com.example.demo.entity.SchoolStudents;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepo extends JpaRepository<SchoolStudents, Long> {

    List<SchoolStudents> findByGradeAndRoll(String grade,int roll);
    List<SchoolStudents> findBySession(String session);
    List<SchoolStudents> findByGradeAndShift(String grade, String shift);
    List<SchoolStudents> findByGrade(String grade);

    SchoolStudents findByRollAndGrade(int roll, String grade);

}
