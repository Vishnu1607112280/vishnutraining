package com.zensar.springbootdemo.couponexception;

public class NoSuchCouponExistsException extends RuntimeException{
	private String message;

	public NoSuchCouponExistsException() {
		super();
		
	}

	public NoSuchCouponExistsException(String message) {
		super(message);
		this.message = message;
	}
	

}