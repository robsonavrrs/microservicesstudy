package com.example.peopleresource.interfaces.rest;

import java.util.List;

import org.apache.commons.collections.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.peopleresource.application.PeopleService;
import com.example.peopleresource.domain.people.People;
import com.example.peopleresource.domain.people.PeopleRepository;

@RestController
@RequestMapping(path="/v1.0.0/peoples")
public class PeopleResource {
	
	@Autowired
	private PeopleRepository peopleRepository;
	
	@Autowired
	private PeopleService peopleService;
	
	
	@SuppressWarnings("unchecked")
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<People> getPeoples(){
	
		return IteratorUtils.toList(peopleRepository.findAll().iterator());
	}
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public People postPeoples(@RequestBody People newPeople){
		return peopleService.createPeople(newPeople);
	}

}
