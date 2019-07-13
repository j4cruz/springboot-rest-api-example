package io.java.springboot.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.java.springboot.model.Technology;
import io.java.springboot.service.TechnologyService;

@RestController
public class TechnologyController {
	
	@Autowired
	private TechnologyService TechnologyService;

	@RequestMapping("/technologies")
	public Set<Technology> getAllTechnologies() {
		return TechnologyService.getAllTechnologies();
	}
	
	@RequestMapping("/technologies/{id}")
	public Technology getTechnology(@PathVariable String id) {
		return TechnologyService.getTechnology(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/technologies")
	public void addTechnology(@RequestBody Technology Technology) {
		TechnologyService.addTechnology(Technology);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/technologies/{id}")
	public void updateTechnology(@PathVariable String id, @RequestBody Technology Technology) {
		TechnologyService.updateTechnology(Technology);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/technologies/{id}")
	public void deleteTechnology(@PathVariable String id) {
		TechnologyService.deleteTechnology(id);
	}
}