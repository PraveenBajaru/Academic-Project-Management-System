package com.klef.jfsd.sdpproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.sdpproject.model.Faculty;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Integer>  {
	@Query("select f from Faculty f where f.email=?1 and f.password=?2")
	public Faculty checkfacultylogin(String email , String pwd);
	

}
