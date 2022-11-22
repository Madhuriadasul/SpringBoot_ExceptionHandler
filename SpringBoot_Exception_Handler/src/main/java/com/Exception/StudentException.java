package com.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class StudentException {

	@ExceptionHandler(StudentExceptionDemo.class)
	public ResponseEntity<Exceptionmessage> StudentExceptionCode() {

		Exceptionmessage ex = new Exceptionmessage();
		ex.setLocaldatetime(LocalDateTime.now());
		ex.setMessage("Student not found");

		return new ResponseEntity<>(ex, HttpStatus.NOT_FOUND);

	}

	@ExceptionHandler(BadStudent.class)
	public ResponseEntity<Exceptionmessage> BadStudent() {

		Exceptionmessage ex = new Exceptionmessage();
		ex.setLocaldatetime(LocalDateTime.now());
		ex.setMessage("Student is not good");

		return new ResponseEntity<>(ex, HttpStatus.INTERNAL_SERVER_ERROR);

	}

	@ExceptionHandler(GoodStudent.class)
	public ResponseEntity<Exceptionmessage> GoodStudent() {

		Exceptionmessage ex = new Exceptionmessage();
		ex.setLocaldatetime(LocalDateTime.now());
		ex.setMessage("Student is very good");

		return new ResponseEntity<>(ex, HttpStatus.NOT_EXTENDED);
	}

	@ExceptionHandler(SportsStudent.class)
	public ResponseEntity<Exceptionmessage> SportsStudent() {

		Exceptionmessage ex = new Exceptionmessage();
		ex.setLocaldatetime(LocalDateTime.now());
		ex.setMessage("good sports student");

		return new ResponseEntity<>(ex, HttpStatus.NOT_ACCEPTABLE);
	}
}
