package com.example.demo7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo7.dao.AlienRepo;

@Controller
public class AlienController {
	@Autowired
	AlienRepo repo;
	
	
	@RequestMapping("/")
	public String web() {
		return "home.jsp";
	}

@RequestMapping("/addAlien")
public String addAlien(Alien alien) {
	
	repo.save(alien);
	return "home.jsp";
}
}