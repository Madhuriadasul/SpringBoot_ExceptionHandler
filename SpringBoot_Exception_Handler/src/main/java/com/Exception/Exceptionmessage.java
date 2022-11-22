package com.Exception;

import java.time.LocalDateTime;

public class Exceptionmessage {
	
	private String message;
	private LocalDateTime localdatetime;
	public Exceptionmessage(String message, LocalDateTime localdatetime) {
		super();
		this.message = message;
		this.localdatetime = localdatetime;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public LocalDateTime getLocaldatetime() {
		return localdatetime;
	}
	public void setLocaldatetime(LocalDateTime localdatetime) {
		this.localdatetime = localdatetime;
	}
	@Override
	public String toString() {
		return "Exceptionmessage [message=" + message + ", localdatetime=" + localdatetime + "]";
	}
	public Exceptionmessage() {
		super();

	}

	
}
