package com.masai.dao;

import java.util.List;

import com.masai.exception.BatchException;
import com.masai.exception.CourseException;
import com.masai.exception.StudentException;
import com.masai.model.Batch;
import com.masai.model.Course;
import com.masai.model.Student;

public interface StudentsDao {
	
	// 1. Students can sign-up. At the time of sign up first name, last name, address, mobile number, email,
	//    and password should be taken.
	public String addStudents(Student student) throws StudentException;
	
	// 2. Sign in with an email and password
	public String signIn(String username, String password) throws StudentException;
	
	// 5. Can see all the available course list
	public List<Course> available_course_list()throws CourseException;
	
	// 6. Can see all batches course-wise along with available seats.
	public List<Batch> available_batches_list()throws BatchException;
	
	// Register himself in a course and select any batch for himself from the list of upcoming batches for this course
	public String registerIntoCourseAndBatch()throws CourseException,BatchException;
	
	// 9. Delete an account		
	public String deleteStudentAccount() throws StudentException;
	
}