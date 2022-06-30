package com.zensar.springbootdemo.repository;

import java.util.List;

import com.zensar.springbootdemo.entity.Student;

public interface StudentRepository {

	void insert(Student student);

	void updateStudent(int studentId, String studentName);

	void deleteStudent(int studentId);

	List<Student> findById(int studentId);

	List<Student> findByName(String studentName);
}