package com.anupam.springboot.learningjpaandhibernate.jdbc;

import org.springframework.stereotype.Repository;

import com.anupam.springboot.learningjpaandhibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Course course) {
		em.merge(course);
	}
	
	public Course findById(long id) {
		return em.find(Course.class, id);
	}
	public void deleteById(long id) {
		Course course = em.find(Course.class, id);
		em.remove(course);
	}
	
	
}
