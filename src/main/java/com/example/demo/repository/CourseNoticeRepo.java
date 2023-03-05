package com.example.demo.repository;
import com.example.demo.entity.CourseNotice;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface CourseNoticeRepo extends JpaRepository<CourseNotice, Long>{

    CourseNotice findByTitle(String title);
    List<CourseNotice> findByCourseCourseId(Long course_id);
    


    
}
