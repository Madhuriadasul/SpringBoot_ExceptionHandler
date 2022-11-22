package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Exception.BadStudent;
import com.Exception.GoodStudent;
import com.Exception.SportsStudent;
import com.Exception.StudentExceptionDemo;

@RestController
@RequestMapping("/student")

public class EmployeeController {

	@GetMapping("/get/{id}")
	public String getStudent(@PathVariable String id) {

		if (id.equals("abc")) {
			throw new StudentExceptionDemo("student not found");

		}

		if (id.equals("pqr")) {
			throw new BadStudent();
		}

		if (id.equals("raj")) {
			throw new GoodStudent();
		}

		return id;

	}

	@GetMapping("gett/{name}")
	public String gettStudent(@PathVariable String name) {

		if (name.equals("Madhuri")) {
			throw new SportsStudent("good sports student");
		}
		return name;
	}

}
