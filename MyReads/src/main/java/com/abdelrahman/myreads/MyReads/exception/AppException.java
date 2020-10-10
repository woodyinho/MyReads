package com.abdelrahman.myreads.MyReads.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class AppException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public AppException(ApiError apiError) {
		super(apiError);
	}

	public AppException(String message, Throwable cause) {
		super(message, cause);
	}
}
