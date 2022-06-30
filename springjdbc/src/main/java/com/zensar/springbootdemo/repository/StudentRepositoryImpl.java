package com.zensar.springbootdemo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.zensar.springbootdemo.entity.Student;
import com.zensar.springbootdemo.extractor.StudentResultExtractor;

@Repository("studentRepository")
public class StudentRepositoryImpl implements StudentRepository {

	// private JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource()); //.xml
	// file

	@Autowired
	private JdbcTemplate jdbcTemplate; // JDBCTEMPLATE CLASS

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	// INSERT
	public void insert(Student student) {

		String sql = "INSERT INTO STUDENT VALUES(?,?,?,?)";

		Object[] args = { student.getStudentId(), student.getStudentName(), student.getStudentAge(),
				student.getAddress() };

		int noOfRowsInserted = jdbcTemplate.update(sql, args);
		System.out.println("Rows inserted " + noOfRowsInserted);
	}

	// READ
	public List<Student> findById(int studentId) {
		String sql = "SELECT * FROM STUDENT WHERE studentId=?";
		List<Student> students = jdbcTemplate.query(sql, new StudentResultExtractor(), studentId);
		System.out.println(students);
		return students;
	}

	// UPDATE
	public void updateStudent(int studentId, String studentName) {
		String sql = "UPDATE student SET studentname=? WHERE studentId=?";

		Object args[] = { studentName, studentId };

		int update = jdbcTemplate.update(sql, args);
		System.out.println("updated" + update);

	}

	// DELETE
	public void deleteStudent(int studentId) {
		String sql = "DELETE FROM student WHERE studentId=?";
		Object args[] = { studentId };
		int delete = jdbcTemplate.update(sql, args);
		System.out.println("Deleted" + delete);

	}

	// READ
	public List<Student> findByName(String studentName) {
		String sql = "SELECT * FROM STUDENT WHERE studentName=?";
		List<Student> students = jdbcTemplate.query(sql, new StudentResultExtractor(), studentName);
		System.out.println(students);
		return students;
	}

	/*
	 * public DataSource getDataSource() { String url =
	 * "jdbc:mysql://localhost:3306/jdbcdb"; String username = "root"; String
	 * password = "Ambika@91"; DataSource dataSource = new
	 * DriverManagerDataSource(url, username, password); return dataSource; }
	 */ // Same implementation done in .xml file using beans

}