package com.zensar.springbootdemo.studentexception;

public class StudentAlreadyExistsException extends RuntimeException {

	private String message;

	public StudentAlreadyExistsException() {
		super();

	}
}