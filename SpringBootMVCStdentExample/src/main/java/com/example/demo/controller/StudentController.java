package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.StudentRepo;
import com.example.demo.model.Student;

@Controller
public class StudentController {
	
	@Autowired
	StudentRepo srob;
	
	@RequestMapping("/")
	public String studentHome()
	{
		return "studenthome.jsp";
	}
	
	@RequestMapping("StudentInsertionOperation")
	public String addStudent(Student sob)
	{
		srob.save(sob);
		return "studenthome.jsp";
	}

}
