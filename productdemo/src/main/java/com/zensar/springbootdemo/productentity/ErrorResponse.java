package com.zensar.springbootdemo.productentity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {
	public ErrorResponse(int value, String message2) {
		// TODO Auto-generated constructor stub
	}
	private int statusCode;
	 private String message;
}