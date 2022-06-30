package com.zensar.springbootdemo.studententity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentErrorResponse {
	private int statusCode;
	private String message;

	public StudentErrorResponse(String message) {
		super();
		this.message = message;
	}

}