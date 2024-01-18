package com.example.student.StringbootRestAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.student.StringbootRestAPI.entity.Student;



public interface StudentRepository extends JpaRepository<Student, Integer>{

}