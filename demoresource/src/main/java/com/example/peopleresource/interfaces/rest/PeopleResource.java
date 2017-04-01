package com.example.peopleresource.interfaces.rest;

import com.example.peopleresource.domain.people.People;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/v1.0.0/peoples")
public class PeopleResource {
	
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public List<People> getPeoples(){
		People people = new People();
		people.setNome("teste People");
		
		return Arrays.asList(people);
	}

}
