package com.anto.springmvcboot;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.anto.springmvcboot.model.Alien;



public interface AlienRepo extends JpaRepository<Alien, Integer>{// Integer adalah type primary key

	// List<Alien> findByAnameOrderByAidDesc(String aname);  //Query DSL(Domain Spesific Laguage)
	@Query("from Alien where aname= :name")
	List<Alien> find(@Param("name") String aname);
	

}
