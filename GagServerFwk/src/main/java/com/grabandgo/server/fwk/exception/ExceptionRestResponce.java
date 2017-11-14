package com.grabandgo.server.fwk.exception;

/**
 * @author Alexandr_I
 *
 */
public class ExceptionRestResponce {

	private String message;
	private Exception causedByException;

	public ExceptionRestResponce(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Exception getCausedByException() {
		return causedByException;
	}

	public void setCausedByException(Exception causedByException) {
		this.causedByException = causedByException;
	}

}
