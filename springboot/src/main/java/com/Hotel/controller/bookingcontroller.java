package com.Hotel.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Hotel.bean.Booking;
import com.Hotel.bean.Login;
import com.Hotel.bean.Subject;
import com.Hotel.repository.bookingrepository;
import com.Hotel.service.Service;
import com.Hotel.service.bookingservice;

@Controller
public class bookingcontroller {
	@Autowired
	bookingrepository bookrepository;
	@Autowired
	Service service;
	
@PostMapping("/view/bookingprocess")

public ModelAndView booking (Booking book)
{
	System.out.println("entered");
	Booking booking = book;
System.out.println(booking.getUsername());
System.out.println(book.getUsername());
bookrepository.save(book);
return new ModelAndView("index");
}
@GetMapping("/homeview")
public ModelAndView Home()
{
	


return new ModelAndView("index");
}}

	