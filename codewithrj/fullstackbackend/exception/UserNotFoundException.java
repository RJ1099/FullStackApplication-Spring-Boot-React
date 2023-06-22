package com.codewithrj.fullstackbackend.exception;

public class UserNotFoundException extends RuntimeException{
	
	public UserNotFoundException(Long id) {
		super("no user exists with this id" + id);
	}
}
