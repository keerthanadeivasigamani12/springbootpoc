package com.Hotel.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.Hotel.bean.Login;
import com.Hotel.bean.Subject;
import com.Hotel.repository.SubjectRepository;
@org.springframework.stereotype.Service
public class Service 
{
	@Autowired
	public SubjectRepository subjectRepo;
	public List<Subject> getAllSubjects()
	{
		List<Subject> subjects = new ArrayList<>();
		subjectRepo.findAll().forEach(subjects::add);
		System.out.println(subjects);
		return subjects;	
	}
	public void addSubject(Subject subject) 
	{
		subjectRepo.save(subject);
		
	}
	
	public void updateSubject(String username, Subject subject) {
		subjectRepo.save(subject);
		
	}

	public void deleteSubject(String username) {
		subjectRepo.deleteById(username);
		
	}
	public Subject validateSubject(Login login) {
	Subject user = subjectRepo.getById(login.username);
	if(user.getPassword().equals(login.password)) {
	
	return user;
	}
	else{
	
	return null;
	}


	


}}
