package com.anupam.springboot.learningjpaandhibernate.jdbc;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anupam.springboot.learningjpaandhibernate.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long>{
	List<Course> findByAuthor(String Author);

}