package com.anupam.springboot.learningjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.anupam.springboot.learningjpaandhibernate.jdbc.CourseJpaRepository;
import com.anupam.springboot.learningjpaandhibernate.jdbc.CourseSpringDataJpaRepository;


@Component
public class courseCommandLineRunner implements CommandLineRunner{
//	
//	@Autowired
//	private CourseJdbcRepository repo;

//
//	@Autowired
//	private CourseJpaRepository repo;
	
	@Autowired
	private CourseSpringDataJpaRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repo.save(new Course(2,"Leabsdfn GPC as","in13minyst"));
		repo.save(new Course(1,"Leabsdfn GPC as","in13minyst"));
		repo.save(new Course(3,"Leabsdfn GPC as","in13minyst"));
		repo.save(new Course(4,"Leabsdfn GPC as","in13minyst"));
		repo.deleteById(4l);
		System.out.println(repo.findById(2l));
		System.out.println(repo.findById(3l));
		System.out.println(repo.findById(1l));
		
		System.out.println(repo.findByAuthor("in13minyst"));
	}

}
