package com.algaworks.osworks.domain.exception;

public class NegocioException extends RuntimeException{
	
	private static final long serialVerisionUID = 1L;
	
	public NegocioException(String message) {
		super(message);
	}
	

}
