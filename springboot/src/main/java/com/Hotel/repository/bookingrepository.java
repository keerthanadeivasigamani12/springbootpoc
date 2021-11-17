package com.Hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Hotel.bean.Booking;

public interface bookingrepository extends JpaRepository<Booking,String>{

}
