package com.Hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Hotel.bean.Subject;

public interface SubjectRepository extends JpaRepository<Subject,String>

{

}
