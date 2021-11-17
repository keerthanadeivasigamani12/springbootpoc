package com.Hotel.service;
import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.Hotel.bean.Booking;
import com.Hotel.bean.Login;
import com.Hotel.bean.Subject;
import com.Hotel.repository.SubjectRepository;
import com.Hotel.repository.bookingrepository;
@org.springframework.stereotype.Service
public class bookingservice {
	
	
		@Autowired
		public bookingrepository bookrep;
		public List<Booking> getAllBooking()
		{
			List<Booking> bookings = new ArrayList<>();
			bookrep.findAll().forEach(bookings::add);
			System.out.println(bookings);
			return bookings;	
		}
		public void addBooking(Booking booking) 
		{
			bookrep.save(booking);
			
		}
		
		public void updateSubject(String Roomstatus, Booking booking) {
			bookrep.save(booking);
			
		}

		
			
		
		

		


	}

