package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CourseMaterials;

import java.util.List;

public interface CourseMaterialsRepo extends JpaRepository<CourseMaterials, Long> {

    List<CourseMaterials> findByCourseCourseId(Long course_id);

}

