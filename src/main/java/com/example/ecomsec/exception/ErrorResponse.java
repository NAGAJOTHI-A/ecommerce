package com.example.ecomsec.exception;

import jakarta.persistence.Entity;
import lombok.Data;


@Data
public class ErrorResponse {

	
	private String message;
	private int status;
	public ErrorResponse(String message, int status) {
		super();
		this.message = message;
		this.status = status;
	}
	
	
	
}
