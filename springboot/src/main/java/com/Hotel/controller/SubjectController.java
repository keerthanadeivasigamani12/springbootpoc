package com.Hotel.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.Hotel.bean.Subject;
import com.Hotel.service.Service;



@RestController
public class SubjectController 
{
	@Autowired
	private Service service;
	
	@GetMapping(value="/home",produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView home()
	{
		ModelAndView mv= new ModelAndView("home");
		//mv.addObject("obj",subject);
		return mv;
	}
	
	@GetMapping("/getdata")
	public List<Subject> getAllSubjects()
	{
		return service.getAllSubjects();
	}
	@PostMapping(path = "/register",consumes = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView addSubject(@RequestParam String username, @RequestParam String password, @RequestParam String firstname, @RequestParam String lastname, @RequestParam String email, @RequestParam int phone )
	{
		System.out.println(firstname + " " + lastname);
		Subject sub= new Subject();
		sub.setUsername(username);
		sub.setEmail(email);
		sub.setFirstname(firstname);
		sub.setLastname(lastname);
		sub.setPassword(password);
		sub.setPhone(phone);
	    service.addSubject(sub);
	    System.out.println( "welcome " + sub.getFirstname() + " "  + sub.getLastname());
	    return new ModelAndView("welcome");
	}
	/*
	 * @PutMapping("/putdata/{username}") public void updateSubject(@PathVariable
	 * String username, @RequestBody Subject subject) {
	 * service.updateSubject(username, subject); }
	 * 
	 * @DeleteMapping("/deteledata/{username}") public void
	 * DeleteSubject(@PathVariable String username) {
	 * service.deleteSubject(username); }
	 */
}
